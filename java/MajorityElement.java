package LeetCodeSol.java;

import java.util.HashMap;

public class MajorityElement {
	 public int majorityElement(int[] nums) {
	        int max_count = 0;
	        int max_key = 0;
	        int num = 0;
	        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(int i=0;i<nums.length;i++){
	            if(map.containsKey(nums[i])){
	                 num = map.get(nums[i]);
	                 map.put(nums[i],++num);
	            } else{
	                  num = 1;
	                  map.put(nums[i],num);
	            }
	            if(num > max_count){
	                    max_count = num;
	                    max_key = nums[i];
	            }
	        }
	         return max_key;  
	    }
}
