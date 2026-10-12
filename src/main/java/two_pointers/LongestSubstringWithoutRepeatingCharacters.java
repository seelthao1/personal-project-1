package two_pointers;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode Problem: Longest Substring Without Repeating Characters
 * Description: Given a string, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String str){
        int left = 0;
        int maxLength = 0;
        Set<Character> seen = new HashSet<>();
        for(int right = 0; right < str.length(); right++){
            while(seen.contains(str.charAt(right))){
                seen.remove(str.charAt(left));
                left++;
            }
            seen.add(str.charAt(right));
            if((right - left + 1) > maxLength){
                maxLength = right - left + 1;
            }
        }
        return maxLength;
    }
}
