public class HeapSort {
    public static int[] Sort(int[] ints) {
        int length = ints.length - 1;

        for(int parent = length / 2 - 1; parent >= 0; parent--) {
            heapify(ints, length, parent);
        }

        for(int swapIndex = length; swapIndex >= 0; swapIndex--) {
            if(ints[0] > ints[swapIndex]) {
                swap(ints, 0, swapIndex);

                heapify(ints, swapIndex, 0);
            }
        }

        return ints;
    }

    private static void heapify(int[] ints, int length, int parent) {
        int largest = parent;
        int leftChild = parent * 2 + 1;
        int rightChild = parent * 2 + 2;

        if(leftChild < length && ints[leftChild] > ints[largest]) {
            largest = leftChild;
        }

        if(rightChild < length && ints[rightChild] > ints[largest]) {
            largest = rightChild;
        }

        if(largest != parent) {
            swap(ints, largest, parent);

            heapify(ints, length, largest);
        }
    }

    private static void swap(int[] ints, int indexA, int indexB) {
        int temp = ints[indexA];
        ints[indexA] = ints[indexB];
        ints[indexB] = temp;
    }
}
