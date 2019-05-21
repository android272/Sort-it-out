public class BubbleSort {
    public static int[] sort(int[] ints) {
        for(int i = 1; i < ints.length; i++) {
            if (ints[i - 1] > ints[i]) {
                int temp = ints[i];
                ints[i] = ints[i - 1];
                ints[i -1] = temp;
            }
        }
        return ints;
    }
}