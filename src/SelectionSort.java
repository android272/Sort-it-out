public class SelectionSort {
    public static int[] Sort(int[] ints) {
        return ints;
    }

    public static int findSmallestIndex(int[] ints) {
        int temp;
        for(int i = 0; i < ints.length; i++) {
            for(int j = i + 1; j < ints.length; j++) {
                if(ints[j] < ints[i]) {
                    temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }

        }
        return ints[0];
    }

    public static int[] swap(int[] ints, int firstIndex, int secondIndex) {
        int temp = ints[firstIndex];
        ints[firstIndex] = ints[secondIndex];
        ints[secondIndex] = temp;

        return ints;
    }
}
