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
        assertTrue(solution.groupAnagrams(new String[]{}).isEmpty());
        assertEquals(1,solution.groupAnagrams(new String[]{"hello"}).size());
        assertEquals(3, solution.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}).size());

        List<List<String>> result2 = solution.groupAnagrams(new String[]{"abc", "bca", "cab", "aab"});
        assertEquals(2, result2.size());
        assertEquals(3,result2.get(0).size());
    }
}
