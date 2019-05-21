public class BubbleSort {
    public static int[] sortAscending(int[] ints) {
        for(int i = 0; i < ints.length - 1; i++) {
            for(int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        return ints;
    }

    public static int[] sortAscendingOptimized(int[] ints) {
        boolean swapped;
        for(int i = 0; i < ints.length - 1; i++) {
            swapped = false;
            for(int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                    swapped = true;
                }
            }

            if(swapped == false) { break; }
        }
        return ints;
    }

    public static int[] sortDescending(int[] ints) {
        for(int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] < ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        return ints;
    }

    public static int[] sortDescendingOptimized(int[] ints) {
        boolean swapped;
        for(int i = 0; i < ints.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] < ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                    swapped = true;
                }
            }

            if(swapped == false) { break; }
        }
        return ints;
    }
}