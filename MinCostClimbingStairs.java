package leetcode;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
    	int[] store = new int[cost.length+1];
    	store[0] = cost[0];
    	store[1] = cost[1];
    	for(int i=2; i<=cost.length; i++) {
    		int temp = i==cost.length?0:cost[i];
    		store[i] = Math.min(store[i-1]+temp, store[i-2]+temp);
    	}
        return store[cost.length];
    }
}
