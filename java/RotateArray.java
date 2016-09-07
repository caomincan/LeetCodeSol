package LeetCodeSol.java;
/**
 * Rotate an array of n elements to the right by k steps.
 *
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] 
 * is rotated to [5,6,7,1,2,3,4].
 * 
 * Seperate array into two parts 0:n-k , n-k+1,n
 * each part do reverse then do whole array reverse
 * 
 * or do a bubble sorting 
 * 
 * @author caomi
 *
 */
public class RotateArray {
	public void rotate(int[] nums, int k) {
	      if(k <=0 || nums==null) return;
	      k = k%nums.length;
	      reverse(nums,0,nums.length-k-1);
	      reverse(nums,nums.length-k,nums.length-1);
	      reverse(nums,0,nums.length-1);
	    }
	    public void swap(int[] nums,int i,int j){
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
	    public void reverse(int[] nums,int left,int right){
	        if(nums == null || nums.length == 1) return;
	        while(left<right){
	            swap(nums,left,right);
	            left++;
	            right--;
	        }
	    }
}
