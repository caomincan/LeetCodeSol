package LeetCodeSol.java;
/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * 
 * Using XOR could find out the single one because duplicate one will turn to 0
 * 
 * @author caomi
 *
 */
public class SingleNumber {
	 public int singleNumber(int[] nums) {
	        int result = 0;
	        for(int i = 0; i< nums.length; i++){
	           result  ^= nums[i];
	        }
	        
	        return result;
	    }
}
