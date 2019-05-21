public class BubbleSort {
    public static int[] sortAscending(int[] ints) {
        for(int i = 0; i < ints.length - 1; i++) {
            for(int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
                }
            }
        }
        return ints;
    }

    public static int[] sortDescending(int[] ints) {
        for(int i = 0; i < ints.length - 1; i++) {
            if (ints[i] < ints[i + 1]) {
                int temp = ints[i];
                ints[i] = ints[i + 1];
                ints[i + 1] = temp;
            }
        }
        return ints;
    }
}