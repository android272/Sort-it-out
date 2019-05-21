import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {
    @Test
    public void When_Bubble_Sort_Is_Passed_A_Sorted_Array_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[]{1, 2}, BubbleSort.sort(new int[] {1, 2}));
        assertArrayEquals(new int[]{1, 2, 3}, BubbleSort.sort(new int[] {1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3, 4}, BubbleSort.sort(new int[] {1, 2, 3, 4}));
    }

    @Test
    public void When_Bubble_Sort_Is_Passed_An_Unsorted_Array_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[]{1, 2}, BubbleSort.sort(new int[] {2, 1}));
        assertArrayEquals(new int[]{2, 18, 30}, BubbleSort.sort(new int[] {30, 18, 2}));
        assertArrayEquals(new int[]{15, 22, 36, 44}, BubbleSort.sort(new int[] {36, 44, 15, 22}));
    }
}