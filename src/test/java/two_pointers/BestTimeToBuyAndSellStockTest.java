import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BestTimeToBuyAndSellStockTest {
    @Test
    public void testMaxProfit() {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        // TODO: Add test cases
        assertEquals(5, solution.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(0, solution.maxProfit(new int[]{7,6,4,3,1}));
    }
}
