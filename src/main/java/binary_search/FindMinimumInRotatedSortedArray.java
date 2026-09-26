package binary_search;

import java.util.Arrays;

/**
 * LeetCode Problem: Find Minimum in Rotated Sorted Array
 * Description: Find the minimum element in a rotated sorted array.
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        Arrays.sort(nums);
        int min = nums[0];
        return min;
    }
}
