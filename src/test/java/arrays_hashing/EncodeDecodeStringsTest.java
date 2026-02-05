import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class EncodeDecodeStringsTest {
    @Test
    public void testEncodeDecode() {
        EncodeDecodeStrings solution = new EncodeDecodeStrings();
        // TODO: Add test cases
        List<String> input = Arrays.asList("leet","code","!@#");
        String encoded = solution.encode(input);
        List<String> decoded = solution.decode(encoded);
        // Example: assertEquals(input, decoded);
    }
}
