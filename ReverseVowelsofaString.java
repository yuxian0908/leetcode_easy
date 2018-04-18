package leetcode;
import java.util.Arrays;

public class ReverseVowelsofaString {
    public String reverseVowels(String s) {
    	char[] word = s.toCharArray();
    	String vowels = "aeiouAEIOU";
    	
    	int high = word.length-1;
    	int low = 0;
    	
    	while(high>low) {
    		while(high>low&&!vowels.contains(word[high]+"")) {
    			high--;
    		}
    		while(high>low&&!vowels.contains(word[low]+"")) {
    			low++;
    		}
    		
    		char temp = word[high];
    		word[high] = word[low];
    		word[low] = temp;
    		high--;
    		low++;
    	}
    	
        return new String(word);
    }
}
