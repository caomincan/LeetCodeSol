/**
 * Given an integer array nums, find the sum of the elements between indices i and j (i ¡Ü j), inclusive
 * 
 * Note:
 * You may assume that the array does not change.
 * There are many calls to sumRange function.
 * 
 * @author caomi
 *
 */
public class NumArray {
	private int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
        //calculate prefix sum
        for(int i = 1; i< nums.length; i++){
            this.nums[i] += this.nums[i-1];
        }
    }

    public int sumRange(int i, int j) {
        if(i<0 || i>= nums.length || j<0 || j>= nums.length || j<i ) return 0;
        if(i==0) return nums[j];
        else return nums[j]-nums[i-1];
    }
}

//Your NumArray object will be instantiated and called as such:
//NumArray numArray = new NumArray(nums);
//numArray.sumRange(0, 1);
//numArray.sumRange(1, 2);