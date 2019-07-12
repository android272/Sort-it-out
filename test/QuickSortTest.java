import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest {
    @Test
    public void When_Quick_Sort_Is_Passed_A_Sorted_Array_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2 }, QuickSort.Sort(new int[] { 1, 2 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, QuickSort.Sort(new int[] { 1, 2, 3 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, QuickSort.Sort(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    public void When_Quick_Sort_Is_Passed_An_Unsorted_Two_Element_Array_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2 }, QuickSort.Sort(new int[] { 2, 1 }));
    }

    @Test
    public void When_Quick_Sort_Is_Passed_An_Unsorted_Three_Element_Array_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2, 3 }, QuickSort.Sort(new int[] { 1, 3, 2 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, QuickSort.Sort(new int[] { 3, 1, 2 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, QuickSort.Sort(new int[] { 3, 2, 1 }));
    }

    @Test
    public void When_Quick_Sort_Is_Passed_An_Unsorted_Six_Element_Array_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, QuickSort.Sort(new int[] { 1, 5, 4, 6, 3, 2 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, QuickSort.Sort(new int[] { 6, 3, 1, 5, 2, 4 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, QuickSort.Sort(new int[] { 6, 5, 4, 3, 2, 1 }));
    }

    @Test
    public void When_Quick_Sort_Is_Passed_An_Unsorted_Array_With_Duplicate_Values_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2, 3, 3, 5, 6 }, QuickSort.Sort(new int[] { 1, 5, 3, 6, 3, 2 }));

    }
}
