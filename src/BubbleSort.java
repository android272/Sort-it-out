public class BubbleSort {
    public static int[] sort(int[] ints) {
        if(ints[0] > ints[1]) {
            int temp = ints[1];
            ints[1] = ints[0];
            ints[0] = temp;
        }
        return ints;
    }
}