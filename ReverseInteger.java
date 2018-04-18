package leetcode;
import java.util.Arrays;

public class ReverseInteger {
	
	public static void main(String[] args) {
		ReverseInteger test = new ReverseInteger();
		
		System.out.println(test.reverse(1563847412));
		
	}
	
	public int reverse(int x) {
		
		if(x < -Integer.MAX_VALUE) {//check if x is overflowed
			return 0;
		}
		int originNum=Math.abs(-x);
		
		int reversed = 0;
		
		//if x==0 return 0 directly
		if(x==0) {
			return 0;
		}
		
		
		//get digit total number
		double digitNum = Math.log(originNum)/Math.log(10);
		int digitNumInt = (int) digitNum+1;

		//create an array to store each digit
		int[] digit = new int[digitNumInt];
		
		
		//get each digit in a reversed order
		for(int i=digitNumInt-1; 0<=i; i--) {
			int thisDigit = (int) (Math.pow(10,i));
			int nextDigit = (int) (Math.pow(10,i+1));
			digit[i] = originNum/thisDigit - originNum/nextDigit*10;
		}
		
		for(int i=0; i<digit.length; i++) {
			if(Math.pow(10,i)>Integer.MAX_VALUE) {
				return 0;
			}
			int thisDigit = (int) (Math.pow(10,i));
			if(digit[digit.length-1-i]>Integer.MAX_VALUE/thisDigit||
					reversed>Integer.MAX_VALUE-digit[digit.length-1-i]*thisDigit) {//check if it is overflowed
				return 0;
			}
			reversed = reversed + digit[digit.length-1-i]*thisDigit;
			
		}

		
		
		if(x<0) {
			reversed=-reversed;
		}
		
        return reversed;
    }
}
