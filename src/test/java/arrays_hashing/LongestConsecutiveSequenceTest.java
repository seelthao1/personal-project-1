package arrays_hashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestConsecutiveSequenceTest {
    @Test
    public void testLongestConsecutive() {
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
        // TODO: Add test cases
        assertEquals(4, solution.longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
