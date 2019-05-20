import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {
    @Test
    public void When_Bubble_Sort_Is_Passed_An_Array_Of_Sorted_Numbers_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[]{1, 2, 3}, BubbleSort.sort(new int[] {1, 2, 3}));
    }
}