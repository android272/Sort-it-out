public class SelectionSort {
    public static int[] Sort(int[] ints) {
        for(int i = 0; i < ints.length; i++) {
            int index = findSmallestIndex(ints, i);
            ints = swap(ints, i, index);
        }

        return ints;
    }

    public static int findSmallestIndex(int[] ints, int startIndex) {
        int minValue = ints[startIndex];
        int minIndex = startIndex;

        for(int i = minIndex + 1; i < ints.length; i++) {
            if(ints[i] < minValue) {
                minIndex = i;
                minValue = ints[i];
            }
        }

        return minIndex;
    }

    public static int[] swap(int[] ints, int firstIndex, int secondIndex) {
        int temp = ints[firstIndex];
        ints[firstIndex] = ints[secondIndex];
        ints[secondIndex] = temp;

        return ints;
    }
}
