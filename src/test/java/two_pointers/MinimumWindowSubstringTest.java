package two_pointers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinimumWindowSubstringTest {
    @Test
    public void testMinWindow() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        // TODO: Add test cases
        assertEquals("BANC", solution.minWindow("ADOBECODEBANC", "ABC"));
    }
}
