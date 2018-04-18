package leetcode;

public class PalindromeNumber {
	public static void main(String[] args) {
		PalindromeNumber test = new PalindromeNumber();
		
		System.out.println(test.isPalindrome(1234567890));
		
	}
	
	public boolean isPalindrome(int x) {
		if(x<0) {
			return false;
		}
		if(x==0) {
			return true;
		}
		
		//get digit total number
		double digitNum = Math.log(x)/Math.log(10);
		int digitNumInt = (int) (digitNum+1);
		
		//get mid digit
		double midDigit = (digitNumInt+1)/2.0;
		
		//create an array to store each digit
		int[] digit = new int[digitNumInt];
		
		//get each digit in a reversed order
		for(int i=digitNumInt-1; 0<=i; i--) {
			int thisDigit = (int) (Math.pow(10,i));
			int nextDigit = (int) (Math.pow(10,i+1));
			digit[i] = x/thisDigit - x/nextDigit*10;
		}
		
		//get reversed integer
		int reversed = 0;
		for(int i=0; i<digit.length; i++) {
			int thisDigit = (int) (Math.pow(10,i));
			reversed = reversed + digit[digit.length-1-i]*thisDigit;
		}
		
		//compare origin integer and reversed one 
		if(x==reversed) {
			return true;
		}else {
			return false;
		}
		
    }
}
