package arrays_hashing;

/**
 * LeetCode Problem: Contains Duplicate
 * Description: Given an array of integers, find if the array contains any duplicates.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i <nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
