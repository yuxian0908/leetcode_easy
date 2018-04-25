package leetcode;

import java.util.HashMap;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		String[] sArray = s.split("");
		String[] tArray = t.split("");
		
		HashMap<String, Integer> storeS = new HashMap<String, Integer>();
		HashMap<String, Integer> storeT = new HashMap<String, Integer>();
		
		if(sArray.length!=tArray.length) {
			return false;
		}
		if(sArray==null||tArray==null) {
			return false;
		}
		
		for(int i=0; i<sArray.length; i++) {
			if(storeS.getOrDefault(sArray[i], -1)!=storeT.getOrDefault(tArray[i], -1)) {
				return false;
			}
			if(!storeS.containsKey(sArray[i])&&!storeT.containsKey(tArray[i])) {
				storeS.put(sArray[i], i);
				storeT.put(tArray[i], i);
			}
		}
		
        return true;
    }
}
