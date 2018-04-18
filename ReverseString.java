package leetcode;
import java.util.Arrays;

public class ReverseString {
	public String reverseString(String s) {
		char[] word = s.toCharArray();
		
		int back = word.length-1;
		int front = 0;
		char temp;
		
		while(back>front) {
			temp = word[back];
			word[back--] = word[front];
			word[front++] = temp;
		}
		
		return new String(word);
    }
}
