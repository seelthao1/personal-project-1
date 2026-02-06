package two_pointers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void testLengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        // TODO: Add test cases
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }
}
