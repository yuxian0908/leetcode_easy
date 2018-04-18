package leetcode;

public class ArrangingCoins {
	public int arrangeCoins(int n) {
		
		long high = n;
		long low = 0;
		long middle = 0;
		
		while(high>=low) {
			middle = (high+low)/2;
			
			if((middle*(middle+1))/2>n) {
				high = middle-1;
			}else if((middle*(middle+1))/2<n) {
				if((middle+1)*(middle+2)/2>n) {
					return (int) middle;
				}
				low = middle+1;
			}else if((middle*(middle+1))/2==n) {
				return (int) middle;
			}else if(low>=high) {
				break;
			}
			
		}
		
        return (int) middle;
    }
}
