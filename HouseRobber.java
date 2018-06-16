package leetcode;

import java.util.Arrays;

public class HouseRobber {
    public int rob(int[] nums) {
    	int yes = 0;
    	int no = 0;
    	for(int i=0; i<nums.length; i++) {
    		int rob = no+nums[i];
    		no = Math.max(no, yes);
    		yes = rob;
    	}
    	return Math.max(no, yes);
    }
}
