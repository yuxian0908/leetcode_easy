package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexSumofTwoLists {
	public String[] findRestaurant(String[] list1, String[] list2) {
		/**
		 * 1. ���Nlist1�����s�Jhashmap<String,Integer>: key->list1[i], value->i
		 * 2. ���Mlist2, �Y���Plist1���ƪ��hvalue�[�Wlist2��index, ����j�p
		 * 
		 */
		
		HashMap<String, Integer> storeVal =new HashMap<String, Integer>();
		HashMap<Integer, ArrayList<String>> storeInd =new HashMap<Integer, ArrayList<String>>();
		int smallest = Integer.MAX_VALUE;
		
		
		for(int i=0; i<list1.length; i++) {
			storeVal.put(list1[i], i);
		}
		
		for(int i=0; i<list2.length; i++) {
			if(storeVal.containsKey(list2[i])) {
				int total = storeVal.get(list2[i])+i;
				
				if(total<=smallest) {
					smallest = total;
					ArrayList<String> thisInd =storeInd.containsKey(smallest) 
												?storeInd.get(smallest)
												:new ArrayList<String>();
					thisInd.add(list2[i]);
					storeInd.put(smallest, thisInd);
				}
			}
		}		
		
        return storeInd.get(smallest).toArray(new String[0]);
    }
}
