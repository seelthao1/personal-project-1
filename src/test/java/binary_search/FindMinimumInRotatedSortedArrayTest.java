import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindMinimumInRotatedSortedArrayTest {
    @Test
    public void testFindMin() {
        FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();
        // TODO: Add test cases
        assertEquals(1, solution.findMin(new int[]{3,4,5,1,2}));
    }
}
