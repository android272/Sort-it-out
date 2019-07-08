public class QuickSort {
    public static int[] Sort(int[] ints) {
        if(ints[0] > ints[1]) {
            int temp = ints[0];
            ints[0] = ints[1];
            ints[1] = temp;
        }
        return ints;
    }
}
