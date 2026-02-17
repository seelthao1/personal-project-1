package arrays_hashing;

import java.util.*;


/**
 * LeetCode Problem: Group Anagrams
 * Description: Given an array of strings, group anagrams together.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map1 = new HashMap<>();
        for (String str : strs) {
            char[] chars1 = str.toCharArray();
            Arrays.sort(chars1);

            String key1 = new String(chars1);

            //create list if missing
            map1.putIfAbsent(key1, new ArrayList<>());
            map1.get(key1).add(str);
        }
        return new ArrayList<>(map1.values());
    }
}
