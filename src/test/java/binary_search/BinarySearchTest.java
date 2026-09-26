package binary_search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {
    @Test
    public void testSearch() {
        BinarySearch solution = new BinarySearch();
        assertEquals(-1, solution.binarySearch(new int[]{1, 2, 3, 4, 5, 6}, 7));
        assertEquals(4, solution.binarySearch(new int[]{1, 2, 3, 4, 5, 6}, 5));
        // TODO: Add more test cases
    }
}