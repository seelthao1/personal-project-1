package arrays_hashing;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Problem: Group Anagrams
 * Description: Given an array of strings, group anagrams together.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(int strPos=0; strPos <strs.length; strPos++ ){
            int[] count = new int[26];
            for(char c : strs[strPos].toCharArray()){
                count[c-'a']++;
            }
            String key = java.util.Arrays.toString(count);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[strPos]);
        }
        return new ArrayList<>(map.values());
    }
}
