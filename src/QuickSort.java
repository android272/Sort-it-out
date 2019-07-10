public class QuickSort {
    public static int[] Sort(int[] ints) {
        int low = 0;
        int high = ints.length - 1;
        int indexOfPivotValue =  high;
        int indexOfValuesGreaterThanPivot = low -1;

        for(int indexOfValuesLessThanPivot = low; indexOfValuesLessThanPivot <= high - 1; indexOfValuesLessThanPivot++) {
            if(ints[indexOfValuesLessThanPivot] <= ints[indexOfPivotValue]) {
                indexOfValuesGreaterThanPivot++;
                swap(ints, indexOfValuesLessThanPivot, indexOfValuesGreaterThanPivot);
            }
        }

        swap(ints, indexOfValuesGreaterThanPivot + 1 , indexOfPivotValue);

        return ints;
    }

    private static void swap(int[] ints, int a, int b) {
        int temp = ints[b];
        ints[b] = ints[a];
        ints[a] = temp;
    }
}
