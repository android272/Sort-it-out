public class QuickSort {
    public static int[] Sort(int[] ints) {
        sort(ints, 0, ints.length - 1);

        return ints;
    }

    private static void sort(int[] ints, int low, int high) {
        if(low < high) {
            int midpoint = partition(ints, low, high);
            sort(ints, low, midpoint);
            sort(ints, midpoint + 1, high);
        }
    }

    private static int partition(int[] ints, int low, int high) {
        int pivot = high;
        int indexGreaterThanPivot = low - 1;

        for (int indexLesserThanPivot = low; indexLesserThanPivot <= high - 1; indexLesserThanPivot++) {
            if (ints[indexLesserThanPivot] <= ints[pivot]) {
                indexGreaterThanPivot++;
                swap(ints, indexLesserThanPivot, indexGreaterThanPivot);
            }
        }

        swap(ints, indexGreaterThanPivot + 1, pivot);
        return (indexGreaterThanPivot + 1);
    }

    private static void swap(int[] ints, int a, int b) {
        int temp = ints[b];
        ints[b] = ints[a];
        ints[a] = temp;
    }
}
