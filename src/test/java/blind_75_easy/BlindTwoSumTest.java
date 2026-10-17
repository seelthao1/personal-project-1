package blind_75_easy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BlindTwoSumTest {
    @Test
    public void testBlindTwoSumTest() {
        BlindTwoSum solution = new BlindTwoSum();
        assertArrayEquals(solution.blindTwoSumBruteForce(new int[]{1, 2, 3, 4, 5, 6}, 7), new int[]{0,5});
    }
}
