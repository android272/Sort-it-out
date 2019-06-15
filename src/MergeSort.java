public class MergeSort {
    public static int[] Sort(int[] ints) {
        if(ints[0] > ints[1]) {
            int tmp = ints[0];
            ints[0] = ints[1];
            ints[1] = tmp;
        }
        return ints;
    }

    private static void merge(int[] input, int start, int half, int end) {

    }
}
