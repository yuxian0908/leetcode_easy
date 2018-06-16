package leetcode;

import java.util.HashMap;

public class ClimbingStairs {
	HashMap<Integer, Integer> store = new HashMap<>();
	
    public int climbStairs(int n) {
    	if(n<2) return 1;
    	if(store.containsKey(n)) return store.get(n);
    	int res = climbStairs(n-1)+climbStairs(n-2);
    	store.put(n, res);
        return res;
    }
}
