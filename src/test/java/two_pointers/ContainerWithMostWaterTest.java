import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainerWithMostWaterTest {
    @Test
    public void testMaxArea() {
        ContainerWithMostWater solution = new ContainerWithMostWater();
        // TODO: Add test cases
        assertEquals(49, solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
