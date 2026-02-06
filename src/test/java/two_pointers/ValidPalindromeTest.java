package two_pointers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidPalindromeTest {
    @Test
    public void testIsPalindrome() {
        ValidPalindrome solution = new ValidPalindrome();
        assertFalse(solution.isPalindrome("race a car"));
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        // TODO: Add more test cases
    }
}