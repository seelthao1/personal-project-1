package binary_search;

/**
 * LeetCode Problem: Search in Rotated Sorted Array
 * Description: Given a rotated sorted array and a target value, return the index if the target is found. If not, return -1.
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int leftIdx = 0;
        int rightIdx = nums.length -1;

        while (leftIdx <= rightIdx){
            int midIdx = leftIdx + (rightIdx - leftIdx) / 2;

            if(nums[midIdx] == target){
                return midIdx;
            }
            if(nums[leftIdx] <= nums[midIdx]){
                if(nums[leftIdx] <= target && target < nums[midIdx]){
                    rightIdx = midIdx -1;
                }else{
                    leftIdx = midIdx + 1;
                }
            } else {
                if (nums[midIdx] < target && target <= nums[rightIdx]){
                    leftIdx = midIdx + 1;
                } else {
                    rightIdx = midIdx -1;
                }
            }
        }
        return -1;
    }
}
