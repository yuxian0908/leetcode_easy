package leetcode;

import java.util.HashMap;

public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
		char[] patAry = pattern.toCharArray();
		String[] strAry = str.split(" ");
		
		HashMap<Character, String> storePat = new HashMap<Character, String>();
		HashMap<String, Character> storeStr = new HashMap<String, Character>();
		
		if(patAry.length!=strAry.length) {
			return false;
		}
		if(patAry==null||strAry==null) {
			return false;
		}
		
		for(int i=0; i<patAry.length; i++) {
			
			if(storePat.containsKey(patAry[i])) {
				if(!storePat.get(patAry[i]).equals(strAry[i])) {
					return false;
				}
			}else if(storeStr.containsKey(strAry[i])) {
	            return false;
	        }
			
			storePat.put(patAry[i], strAry[i]);
			storeStr.put(strAry[i], patAry[i]);
			
		}
		
		
        return true;
    }
}
