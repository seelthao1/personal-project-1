package blind_75_easy;

/* You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */
import java.util.HashMap;
import java.util.Map;

public class BlindTwoSum{
    public int[] blindTwoSumBruteForce(int[] nums, int target){
        for(int i = 0; i < nums.length; i ++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    public int[] blindTwoSumEfficient(int[] nums, int target){
        //Using Hash map
        Map<Integer, Integer> map = new HashMap<>();

        //Iterate nums
        for(int i = 0; i < nums.length; i++){
            int difference = target - nums [i];
            if(map.containsKey(difference)){
                return new int[] {map.get(difference), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}