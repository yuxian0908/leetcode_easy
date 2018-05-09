package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisitCount {
	public List<String> subdomainVisits(String[] cpdomains) {
        
		HashMap<String, Integer> store = new HashMap<>();
		List<String> result = new ArrayList<String>();
		
		for(int i=0; i<cpdomains.length; i++) {
			String[] strNum=cpdomains[i].split(" "); 
			int num = Integer.parseInt(strNum[0]);
			String[] strAry = strNum[1].split("\\.");

			for(int j=strAry.length-1; j>=0; j--) {
				if(j!=strAry.length-1) {
					strAry[j] = strAry[j]+"."+strAry[j+1];
				}
				if(!store.containsKey(strAry[j])) {
					store.put(strAry[j], num);
				}else {
					store.put(strAry[j], store.get(strAry[j])+num);
				}
			}
		}

		for(String key: store.keySet()) {
			String concat = store.get(key)+" "+key;
			result.add(concat);
		}
				
		return result;
    }
}
