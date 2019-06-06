import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test
    public void When_Insertion_Sort_Is_Passed_A_Sorted_Array_It_Returns_A_Sorted_Array() {
        assertArrayEquals(new int[] { 1, 2 }, InsertionSort.Sort(new int[] { 1, 2 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, InsertionSort.Sort(new int[] { 1, 2, 3 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, InsertionSort.Sort(new int[] { 1, 2, 3, 4 }));
    }
}