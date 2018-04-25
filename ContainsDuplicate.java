package leetcode;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
    	HashSet<Integer> store = new HashSet<Integer>();
    	
    	for(int i=0; i<nums.length; i++) {
    		if(store.contains(nums[i]))
    			return true;
    		store.add(nums[i]);
    	}
    	
        return false;
    }
}
