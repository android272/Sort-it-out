import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test
    public void When_Insertion_Sort_Is_Passed_An_Array_And_A_Number_A_Sorted_Array_Is_Returned() {
        assertArrayEquals(new int[] { 1, 2, 3 }, InsertionSort.Sort(new int[] { 1, 2 }, 3));
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, InsertionSort.Sort(new int[] { 1, 2, 3 }, 4));
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, InsertionSort.Sort(new int[] { 1, 2, 3, 4 }, 5));
    }
}
