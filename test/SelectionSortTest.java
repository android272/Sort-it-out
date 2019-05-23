import org.junit.Test;
import static org.junit.Assert.*;

public class SelectionSortTest {
    @Test
    public void When_Selection_Sort_Is_Passed_A_Sorted_Array_It_Returns_An_Ascending_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2 }, SelectionSort.Sort(new int[] { 1, 2 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, SelectionSort.Sort(new int[] { 1, 2, 3 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, SelectionSort.Sort(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    public void When_Find_Smallest_Index_Is_Passed_An_Array_It_Returns_The_Smallest_Index() {
        assertEquals(1, SelectionSort.findSmallestIndex(new int[] { 2, 1 }));
        assertEquals(1, SelectionSort.findSmallestIndex(new int[] { 3, 2, 1 }));
        assertEquals(1, SelectionSort.findSmallestIndex(new int[] { 4, 3, 2, 1 }));
    }
}
