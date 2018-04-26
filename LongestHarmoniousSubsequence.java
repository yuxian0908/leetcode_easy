package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
    	/*
    	 * �إߨ��hashmap,upper�Mlower
    	 * upper�x�sn�Mn+1
    	 * self�x�sn
    	 */
    	
    	Map<Integer, Integer> self = new HashMap<Integer, Integer>();
    	
    	int ptr = 0;
    	int largest = 0;
    	
    	while(ptr<nums.length) {
    		
    		self.put(nums[ptr], (self.containsKey(nums[ptr])?self.get(nums[ptr])+1:1));
    		
    		ptr++;
    	}
    	
    	for (Integer key : self.keySet()) {
    		self.get(key);
    		int temp = self.containsKey(key+1) ? self.get(key)+self.get(key+1) : 0;
    		largest = temp>largest ? temp : largest;
    	    System.out.println("largest:"+largest);
    	}
    	
        return largest;
    }
}
