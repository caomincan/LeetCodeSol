package LeetCodeSol.java;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution.
 * @author caomi
 *
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int[] toFind = new int[nums.length];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();  // value and index
        for(int i=0;i<nums.length;i++){
            toFind[i] = target - nums[i];
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
        }
        int[] result = new int[2];
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(toFind[i])){
                result[0] = i;
                result[1] = map.get(toFind[i]);
                if(result[0] != result[1]) break;
            }
        }
        return result;
    }
}
