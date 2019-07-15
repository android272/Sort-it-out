import org.junit.Test;
import static org.junit.Assert.*;

public class HeapSortTest {
    @Test
    public void When_Heap_Sort_Is_Passed_A_Sorted_Array_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2 }, HeapSort.Sort(new int[] { 1, 2 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, HeapSort.Sort(new int[] { 1, 2, 3 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, HeapSort.Sort(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    public void When_Heap_Sort_Is_Passed_An_Unsorted_Two_Element_Array_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2 }, HeapSort.Sort(new int[] { 2, 1 }));
    }

    @Test
    public void When_Heap_Sort_Is_Passed_An_Unsorted_Three_Element_Array_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2, 3 }, HeapSort.Sort(new int[] { 3, 2, 1 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, HeapSort.Sort(new int[] { 2, 3, 1 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, HeapSort.Sort(new int[] { 1, 3, 2 }));
    }

    @Test
    public void When_Heap_Sort_Is_Passed_An_Unsorted_Five_Element_Array_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, HeapSort.Sort(new int[] { 5, 3, 4, 2, 1 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, HeapSort.Sort(new int[] { 4, 2, 5, 3, 1 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, HeapSort.Sort(new int[] { 1, 4, 3, 2, 5 }));
    }
}
