package leetcode;

import java.util.HashSet;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
    	
    	HashSet<Integer> store = new HashSet<Integer>();
    	int miss=0;
    	int dup=0;
    	int ptr=0;
    	int sum=0;
    	int differ=0;
    	int total=nums.length*(nums.length+1)/2;
    	
    	while(ptr<nums.length) {
    		if(store.contains(nums[ptr])) {
    			dup = nums[ptr];
    		}
    		store.add(nums[ptr]);
    		sum=sum+nums[ptr];
    		ptr++;
    	}
    	
    	differ=total-sum;
    	miss=differ+dup;
    	
        return new int[] {dup,miss};
    }
}
