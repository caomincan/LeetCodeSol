package LeetCodeSol.java;
/**
 * Given an array of integers that is already sorted in ascending order, 
 * find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such 
 * that they add up to the target, where index1 must be less than index2. 
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * 
 * @author caomi
 *
 */
public class TwoSum2 {
	public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if(numbers== null || numbers.length == 0) return result;
        int left = 0, right = numbers.length-1;
        // rule out impossible value
        while(left<right){
            for(;left<=right && (target-numbers[left])>numbers[right];left++){}
            for(;right>=left && (target-numbers[right])<numbers[left];right--){}
            if(numbers[left]+numbers[right]== target){
                result[0] = left+1;
                result[1] = right+1;
                break;
            }
        }
        
        return result;
    }
}
