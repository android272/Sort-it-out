public class InsertionSort {
    public static int[] Sort(int[] ints) {
        int i, j, key;
        for (i = 1; i < ints.length; i++) {
            j = i;
            while (j > 0 && ints[j - 1] > ints[j]) {
                key = ints[j];
                ints[j] = ints[j - 1];
                ints[j - 1] = key;
                j--;
            }
        }

        return ints;
    }
}
