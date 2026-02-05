import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {
    @Test
    public void testIsValid() {
        ValidParentheses solution = new ValidParentheses();
        // TODO: Add test cases
        assertTrue(solution.isValid("()"));
        assertFalse(solution.isValid("(]"));
    }
}
