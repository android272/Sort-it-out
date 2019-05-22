import org.junit.Test;
import static org.junit.Assert.*;

public class SelectionSortTest {
    @Test
    public void When_Selection_Sort_Is_Passed_A_Sorted_Array_It_Returns_An_Ascending_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2 }, SelectionSort.Sort(new int[] { 1, 2 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, SelectionSort.Sort(new int[] { 1, 2, 3 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, SelectionSort.Sort(new int[] { 1, 2, 3, 4 }));
    }
}
