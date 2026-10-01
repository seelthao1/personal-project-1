package intervals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeIntervalsTest {
    @Test
    public void testMerge() {
        MergeIntervals solution = new MergeIntervals();
        assertArrayEquals(new int[][]{{1,6},{8,10},{15,18}}, solution.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}));
    }
}
