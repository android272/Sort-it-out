public class QuickSort {
    public static int[] Sort(int[] ints) {
        int low = 0;
        int high = ints.length - 1;
        int pivot =  high;
        int j = low -1;

        for(int i = low; i <= high - 1; i++) {
            if(ints[i] <= ints[pivot]) {
                j++;
                swap(ints, i, j);
            }
        }

        swap(ints, j + 1 , pivot);

        return ints;
    }

    static void swap(int[] ints, int a, int b) {
        int temp = ints[b];
        ints[b] = ints[a];
        ints[a] = temp;
    }
}
