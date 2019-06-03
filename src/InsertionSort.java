public class InsertionSort {
    public static int[] Sort(int[] ints, int insertion) {
        int[] output = new int[ints.length + 1];
        for (int i = 0; i < ints.length; i++) {
            output[i] = ints[i];
        }
        output[output.length - 1] = insertion;
        return output;
    }
}
