package Leetcode;

public class MoveZeros {
	 public void moveZeroes(int[] nums) {
	        int id = 0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i] != 0) swap(nums,id++,i);
	        }
	    }
	    public void swap(int[] nums,int i,int j){
	        int tmp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = tmp;
	      
	    }
}
