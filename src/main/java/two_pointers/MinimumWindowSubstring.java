package two_pointers;
import java.util.HashMap;
import java.util.Map;
/**
 * LeetCode Problem: Minimum Window Substring
 * Description: Given two strings s and t, return the minimum window in s which contains all the characters in t.
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t){
        int left = 0;
        int right = 0;
        Map<Character, Integer> targetCount = new HashMap<>();
        Map<Character, Integer> windowCount = new HashMap<>();
        int minStart = 0;
        int minLength = Integer.MAX_VALUE;
        int formed = 0;
        if(s.isEmpty() || t.isEmpty()){
            return "";
        }

        for(char c:t.toCharArray()){
            targetCount.put(c, targetCount.getOrDefault(c,0) + 1);
        }
        int required = targetCount.size();

        for(right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);
            if(targetCount.containsKey(c) && windowCount.get(c).equals(targetCount.get(c))){
                formed++;
            }
            while(formed == required){
                int currentLength = right - left + 1;
                if(currentLength < minLength){
                    minLength = currentLength;
                    minStart = left;
                }
                char leftChar = s.charAt(left);
                windowCount.put(leftChar, windowCount.get(leftChar) - 1);
                if(targetCount.containsKey(leftChar) && windowCount.get(leftChar) < targetCount.get(leftChar)){
                    formed --;
                }
                left++;
            }
        }



        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }
}
