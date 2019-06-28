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
    public void When_Merge_Sort_Is_Passed_An_Unsorted_Two_Element_Array_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2 }, MergeSort.Sort(new int[] { 2, 1 }));
    }

    @Test
    public void When_Merge_Sort_Is_Passed_A_Three_Element_Array_It_Returns_Sorted() {
        assertArrayEquals(new int[] { 1, 2, 3 }, MergeSort.Sort(new int[] { 3, 1, 2}));
    }

    @Test
    public  void When_Merge_Sort_Is_Passed_A_Five_Element_Array_It_Returns_Sorted() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, MergeSort.Sort(new int[] { 4, 5, 3, 1, 2}));
    }
}