import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MergeSort {
    public static int[] Sort(int[] ints) {
        divideArray(ints, 0, ints.length - 1);

        return ints;
    }

    private static void divideArray(int[] ints, int start, int end) {
        if(start < end) {
            int midPoint = (start + end) / 2;

            divideArray(ints, start, midPoint);
            divideArray(ints, midPoint +1 , end);
            merge(ints, start, midPoint, end);
        }
    }

        //1, 3 and 2
    private static void merge(int[] data, int start, int midPoint, int end) {
        int workspaceLength = end - start + 1;
        int[] workspace = new int[workspaceLength];
        int workspaceIndex = 0;
        int dataStart = start;
        int dataEnd = midPoint + 1;

        while (dataStart <= midPoint && dataEnd <= end) {
            if (data[dataStart] < data[dataEnd]) {
                workspace[workspaceIndex++] = data[dataStart++];
            } else {
                workspace[workspaceIndex++] = data[dataEnd++];
            }
        }

        while (dataStart <= midPoint) {
            workspace[workspaceIndex++] = data[dataStart++];
        }

        while (dataEnd <= end) {
            workspace[workspaceIndex++] = data[dataEnd++];
        }

        System.arraycopy(workspace, 0, data, start, workspaceLength);
    }

    static int copyToWorkspace(int[] workspace, int workspaceIndex, int[] data, Supplier<Integer> getter, Consumer<Integer> setter) {
        int dataStart = getter.get();
        workspace[workspaceIndex] = data[dataStart];
        setter.accept(dataStart + 1);
        return workspaceIndex + 1;
    }
}
