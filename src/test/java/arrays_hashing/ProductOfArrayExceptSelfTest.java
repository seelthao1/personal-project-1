import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductOfArrayExceptSelfTest {
    @Test
    public void testProductExceptSelf() {
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        // TODO: Add test cases
        assertArrayEquals(new int[]{24,12,8,6}, solution.productExceptSelf(new int[]{1,2,3,4}));
    }
}
