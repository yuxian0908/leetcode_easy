package leetcode;

import java.util.HashSet;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
    	char[] charAry = s.toCharArray();
    	HashSet<Character> store = new HashSet<Character>();
    	int count = 0;
		
    	for(int i=0; i<charAry.length; i++) {
    		if(store.contains(charAry[i])) {
    			store.remove(charAry[i]);
        		count++;
    		}else {
    			store.add(charAry[i]);
    		}
    	}
    	
    	if(!store.isEmpty()) {
    		return count*2+1;
    	}
    	
        return count*2;
    }
}
