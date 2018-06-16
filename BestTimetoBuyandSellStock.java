package leetcode;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
    	if(prices.length==0) return 0;
    	int maxDif=0;
    	int minsofar=prices[0];
    	for(int i=0; i<prices.length; i++) {
    		if(prices[i]>minsofar) {
    			maxDif = Math.max(maxDif, prices[i]-minsofar);
    		}else {
    			minsofar = prices[i];
    		}
    	}
        return maxDif;
    }
}
