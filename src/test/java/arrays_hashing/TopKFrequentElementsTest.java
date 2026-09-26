package arrays_hashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TopKFrequentElementsTest {
    @Test
    public void testTopKFrequent() {
        TopKFrequentElements solution = new TopKFrequentElements();

        int[] result =
                solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);

        assertEquals(2, result.length);
        assertTrue(result[0] == 1 || result[0] == 2);
        assertTrue(result[1] == 1 || result[1] == 2);
        assertNotEquals(result[0], result[1]);
    }
}
