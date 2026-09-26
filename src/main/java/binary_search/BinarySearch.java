package binary_search;
/**
 * LeetCode Problem: Binary Search
 * Description: Given a sorted array and a target value, return the index if the target is found. If not, return -1.
 */
public class BinarySearch {
    public int linearSearch(int[] nums, int target) {
        for(int idx = 0; idx<=nums.length-1; idx++){
            if(target == nums[idx]){
                return idx;
            }
        }
        return -1;
    }

    //Binary Search
    public int binarySearch(int[] nums, int target){
        int leftIdx = 0;
        int rightIdx = nums.length - 1;

        while(leftIdx <= rightIdx){
            int midIdx = leftIdx + (rightIdx - leftIdx) / 2;
            if(nums[midIdx] == target){
                return midIdx;
            }

            if(nums[midIdx] < target){
                leftIdx = midIdx + 1;
            }else {
                rightIdx = midIdx - 1;
            }
        }
        return -1;
    }
}
