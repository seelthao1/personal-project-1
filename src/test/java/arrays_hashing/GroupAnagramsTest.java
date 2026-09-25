package arrays_hashing;

import arrays_hashing.GroupAnagrams;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class GroupAnagramsTest {
    @Test
    public void testGroupAnagrams() {
        GroupAnagrams solution = new GroupAnagrams();
        // TODO: Add test cases
        assertEquals(3, solution.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}).size());
    }
    @Test public void testNoAnagrams() { GroupAnagrams solution = new GroupAnagrams(); List<List<String>> result = solution.groupAnagrams( new String[]{"eat", "tan", "bat"} ); assertEquals(3, result.size()); }
}
