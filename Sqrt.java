package leetcode;

public class Sqrt {
	public static void main(String[] args) {
		Sqrt solution = new Sqrt();
		System.out.println(solution.mySqrt(2147395599));
	}
	
	public int mySqrt(int x) {
		
		//use binary search
		long high = x;
		long low = 0;
		long middle;
		int answer = Integer.MAX_VALUE;
		
		while(high>=low) {
			middle = (high+low)/2;
			if(middle*middle>x) {
				high = middle-1;
			}else if((middle*middle<x)&&((middle+1)*(middle+1)<x)) {
				low = middle+1;
			}else if((middle*middle<=x)&&((middle+1)*(middle+1)>x)) {
				answer = (int) middle;
				break;
			}else if((middle+1)*(middle+1)==x){
				answer = (int) middle+1;
				break;
			}
		}
		
        return answer;
    }
}
