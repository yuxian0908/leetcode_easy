package leetcode;

import java.util.HashSet;

public class JewelsandStones {
    public int numJewelsInStones(String J, String S) {
    	
    	char[] jewels = J.toCharArray();
    	char[] stones = S.toCharArray();
    	int total=0;
    	
    	HashSet<Character> jewStr = new HashSet<>();
    	
    	for(int i=0; i<jewels.length; i++) {
    		jewStr.add(jewels[i]);    		
    	}
    	
    	for(int i=0; i<stones.length; i++) {
    		if(jewStr.contains(stones[i])) {
    			total++;
    		}
    	}
    	
        return total;
    }
}
