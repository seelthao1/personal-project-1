package intervals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InsertIntervalTest {
    @Test
    public void testInsert() {
        InsertInterval solution = new InsertInterval();
        // TODO: Add test cases
        assertArrayEquals(new int[][]{{1,5},{6,9}}, solution.insert(new int[][]{{1,3},{6,9}}, new int[]{2,5}));
    }
}
