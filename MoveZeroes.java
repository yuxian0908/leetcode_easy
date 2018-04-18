package leetcode;
import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
    	
    	int ptrRd = 0;
    	int ptrWt = 0;
        	
    	while(ptrRd<nums.length) {
    		if(nums[ptrRd]!=0) {
    			nums[ptrWt++] = nums[ptrRd++];
    		}else if(nums[ptrRd]==0) {
    			ptrRd++;
    		}
    	}
    	
    	while(ptrRd>ptrWt) {
    		nums[ptrWt++] = 0;
    	}
    	
        System.out.println(Arrays.toString(nums));
    }
}
