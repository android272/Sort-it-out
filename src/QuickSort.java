public class QuickSort {
    public static int[] Sort(int[] ints) {
        if(ints.length == 2) {
            if (ints[0] > ints[1]) {
                int temp = ints[0];
                ints[0] = ints[1];
                ints[1] = temp;
            }
        } else {
            int low = 0;
            int pivot = ints[ints.length - 1];
            int high = pivot - 1;

            for(int i = low; i <= high - 1; i++) {
                if(ints[low] >= pivot && ints[high] <= pivot) {
                    int temp = ints[high];
                    ints[high] = ints[low];
                    ints[low] = temp;
                }
            }

            int temp = ints[high];
            ints[high] = pivot;
            ints[ints.length - 1] = temp;
        }

        return ints;
    }
}
