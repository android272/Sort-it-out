import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {
    @Test
    public void When_Bubble_Sort_Is_Passed_A_Sorted_Array_It_Returns_An_Ascending_Sorted_Array() {
        assertArrayEquals(new int[]{1, 2}, BubbleSort.sortAscending(new int[] {1, 2}));
        assertArrayEquals(new int[]{1, 2, 3}, BubbleSort.sortAscending(new int[] {1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3, 4}, BubbleSort.sortAscending(new int[] {1, 2, 3, 4}));
    }

    @Test
    public void When_Bubble_Sort_Is_Passed_An_Unsorted_Array_It_Returns_An_Ascending_Sorted_Array() {
        assertArrayEquals(new int[]{1, 2}, BubbleSort.sortAscending(new int[] {2, 1}));
        assertArrayEquals(new int[]{1, 2, 3}, BubbleSort.sortAscending(new int[] {3, 1, 2}));
        assertArrayEquals(new int[]{1, 2, 3, 4}, BubbleSort.sortAscending(new int[] {3, 4, 1, 2}));
    }

    @Test
    public void When_Bubble_Sort_Is_Passed_A_Sorted_Array_It_Returns_An_Descending_Sorted_Array() {
        assertArrayEquals(new int[]{2, 1}, BubbleSort.sortDescending(new int[] {2, 1}));
        assertArrayEquals(new int[]{3, 2, 1}, BubbleSort.sortDescending(new int[] {3, 2, 1}));
        assertArrayEquals(new int[]{4, 3, 2, 1}, BubbleSort.sortDescending(new int[] {4, 3, 2, 1}));
    }

    @Test
    public void When_Bubble_Sort_Is_Passed_An_Unsorted_Array_It_Returns_An_Descending_Sorted_Array() {
        assertArrayEquals(new int[]{2, 1}, BubbleSort.sortDescending(new int[] {1, 2}));
        assertArrayEquals(new int[]{3, 2, 1}, BubbleSort.sortDescending(new int[] {1, 3, 2}));
        assertArrayEquals(new int[]{4, 3, 2, 1}, BubbleSort.sortDescending(new int[] {1, 3, 2, 4}));
    }

    @Test
    public void When_Optimized_Bubble_Sort_Is_Passed_A_Sorted_Array_It_Returns_An_Ascending_Sorted_Array() {
        assertArrayEquals(new int[]{1, 2}, BubbleSort.sortAscendingOptimized(new int[] {1, 2}));
        assertArrayEquals(new int[]{1, 2, 3}, BubbleSort.sortAscendingOptimized(new int[] {1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3, 4}, BubbleSort.sortAscendingOptimized(new int[] {1, 2, 3, 4}));
    }

    @Test
    public void When_Optimized_Bubble_Sort_Is_Passed_An_Unsorted_Array_It_Returns_An_Ascending_Sorted_Array() {
        assertArrayEquals(new int[]{1, 2}, BubbleSort.sortAscendingOptimized(new int[] {2, 1}));
        assertArrayEquals(new int[]{1, 2, 3}, BubbleSort.sortAscendingOptimized(new int[] {3, 1, 2}));
        assertArrayEquals(new int[]{1, 2, 3, 4}, BubbleSort.sortAscendingOptimized(new int[] {3, 4, 1, 2}));
    }
}