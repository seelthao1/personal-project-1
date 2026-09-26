package arrays_hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode Problem: Longest Consecutive Sequence
 * Description: Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int maxLength = 0;
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }

        for(int num : numSet) {
            if(!numSet.contains(num - 1)){
                int currentNum = num;
                int currentLength = 1;
                while(numSet.contains(currentNum +1)){
                    currentNum = currentNum + 1;
                    currentLength = currentLength + 1;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }
}
