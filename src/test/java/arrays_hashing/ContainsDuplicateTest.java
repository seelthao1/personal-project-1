package arrays_hashing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateTest {
    @Test
    public void testContainsDuplicate() {
        ContainsDuplicate solution = new ContainsDuplicate();
        // TODO: Add test cases
        assertTrue(solution.containsDuplicate(new int[]{1,2,3,4,5,6,7,8,8,9,10}));
        assertTrue(solution.containsDuplicate(new int[]{1,2,3,1}));
        assertFalse(solution.containsDuplicate(new int[]{1,2,3,4}));
    }
}
