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
    public void When_Swap_Is_Passed_Two_Indicies_Of_An_Array_Swap_Them() {
        assertArrayEquals(new int[] { 1, 2, 5, 8 }, SelectionSort.swap(new int[] { 8, 2, 5, 1 }, 0, 3));
        assertArrayEquals(new int[] { 8, 5, 2, 1 }, SelectionSort.swap(new int[] { 8, 2, 5, 1 }, 1, 2));
        assertArrayEquals(new int[] { 8, 1, 5, 2 }, SelectionSort.swap(new int[] { 8, 2, 5, 1 }, 1, 3));
    }

    @Test
    public void When_Selection_Sort_Is_Passed_An_Unsorted_Array_It_Returns_An_Ascending_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2 }, SelectionSort.Sort(new int[] { 2, 1 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, SelectionSort.Sort(new int[] { 2, 3, 1 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, SelectionSort.Sort(new int[] { 4, 3, 1, 2 }));
    }
}
