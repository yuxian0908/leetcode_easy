package leetcode;

public class NumArray {

	private int[] sum;
    public NumArray(int[] nums) {
    	this.sum = new int[nums.length];
    	
    	if(nums.length>0) this.sum[0]=nums[0];
    	
        for(int i=1; i<nums.length; i++) {
        	this.sum[i] = this.sum[i-1]+nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        return i>0?this.sum[j]-this.sum[i-1]:this.sum[j];
    }
}
