package arrays_hashing;
import java.util.HashSet;
import java.util.Set;
/**
 * LeetCode Problem: Longest Consecutive Sequence
 * Description: Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int n : nums ) {
            set.add(n);
        }

        int longest = 0;
        for(int n:set){
            if(!set.contains(n-1)){
                int current = n;
                int length = 1;
                while(set.contains(current + 1)){
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
