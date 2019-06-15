import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortTest {
    @Test
    public void When_Merge_Sort_Is_Passed_A_Sorted_Array_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2 }, MergeSort.Sort(new int[] { 1, 2 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, MergeSort.Sort(new int[] { 1, 2, 3 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, MergeSort.Sort(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    public void When_Merge_Sort_Is_Passed_An_Unsorted_Array_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2 }, MergeSort.Sort(new int[] { 2, 1 }));
    }
}