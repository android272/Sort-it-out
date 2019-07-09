public class QuickSort {
    public static int[] Sort(int[] ints) {
        if(ints.length == 2) {
            if (ints[0] > ints[1]) {
                swap(ints, 0, 1);

            }
        } else {
            int low = 0;
            int pivot = ints.length - 1;
            int high = pivot - 1;

            for(int i = low; i <= high - 1; i++) {
                if(ints[low] >= ints[pivot] && ints[high] <= ints[pivot]) {
                    swap(ints, low, high);
                }
            }

            if(ints[high] > ints[pivot]) {
                swap(ints, high, pivot);
            }
        }

        return ints;
    }

    static void swap(int[] ints, int a, int b) {
        int temp = ints[b];
        ints[b] = ints[a];
        ints[a] = temp;
    }
}
