public class MergeSort {
    public static int[] Sort(int[] ints) {
        if(ints.length == 2) {
            if (ints[0] > ints[1]) {
                int tmp = ints[0];
                ints[0] = ints[1];
                ints[1] = tmp;
            }
        } else {
            int start = 0;
            int end = ints.length - 1;
            int midPoint = (start + end) /2;

            if (ints[start] > ints[midPoint]) {
                int tmp = ints[start];
                ints[start] = ints[midPoint];
                ints[midPoint] = tmp;
            }

            int[] workspace = new int[end - start + 1];

            int workspaceIndex = 0;
            int firstIndex = start;
            int secondIndex = midPoint + 1;

            while (workspaceIndex < workspace.length) {
                if(secondIndex <= end && firstIndex <= midPoint) {
                    if (ints[firstIndex] > ints[secondIndex]) {
                        workspace[workspaceIndex] = ints[secondIndex];
                        workspaceIndex++;
                        secondIndex++;
                    } else {
                        workspace[workspaceIndex] = ints[firstIndex];
                        workspaceIndex++;
                        firstIndex++;
                    }
                } else if(firstIndex > midPoint){
                    workspace[workspaceIndex] = ints[secondIndex];
                    workspaceIndex++;
                    secondIndex++;
                } else {
                    workspace[workspaceIndex] = ints[firstIndex];
                    workspaceIndex++;
                    firstIndex++;
                }
            }

            for(int i = 0; i < workspace.length; i++) {
                System.out.print(workspace[i]);
                ints[i] = workspace[i];
            }
            System.out.println();
        }
        return ints;
    }

    private static void merge(int[] input, int start, int half, int end) {

    }
}
