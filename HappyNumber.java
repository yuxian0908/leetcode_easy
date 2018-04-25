package leetcode;

import java.util.HashMap;

public class HappyNumber {
	public boolean isHappy(int n) {
		HashMap<Integer, Object> store = new HashMap<Integer, Object>();
		
		store.put(n,null);
		
		while(n!=1) {
			int sum = 0;
			while(n!=0) {
				sum += Math.pow(n%10, 2);
				n = n/10;
			}
			
			if(store.containsKey(sum)) {
				return false;
			}
			
			store.put(sum,null);
			n = sum;
			
		}
				
        return true;
    }
}
