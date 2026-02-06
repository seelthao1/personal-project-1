package intervals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NonOverlappingIntervalsTest {
    @Test
    public void testEraseOverlapIntervals() {
        NonOverlappingIntervals solution = new NonOverlappingIntervals();
        // TODO: Add test cases
        assertEquals(1, solution.eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}}));
    }
}
