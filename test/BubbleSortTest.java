import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {
    @Test
    public void When_Bubble_Sort_Is_Passed_An_Array_Of_Sorted_Numbers_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[]{1, 2}, BubbleSort.sort(new int[] {1, 2}));
    }

    @Test
    public void When_Bubble_Sort_Is_Passed_An_Array_Of_Unsorted_Numbers_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[]{1, 2}, BubbleSort.sort(new int[] {2, 1}));
    }

    @Test
    public void When_Bubble_Sort_Is_Passed_An_Unsorted_Array_Of_Length_three_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[]{1, 2, 3}, BubbleSort.sort(new int[] {2, 1, 3}));
    }
}