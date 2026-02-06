package binary_search;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchInRotatedSortedArrayTest {
    @Test
    public void testSearch() {
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        // TODO: Add test cases
        assertEquals(4, solution.search(new int[]{4,5,6,7,0,1,2}, 0));
        assertEquals(-1, solution.search(new int[]{4,5,6,7,0,1,2}, 3));
    }
}
