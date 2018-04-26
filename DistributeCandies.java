package leetcode;

import java.util.HashSet;

public class DistributeCandies {
	public int distributeCandies(int[] candies) {
		/*
		 * ��hash set ����sister���h�֤��P�������}�G(candies index)
		 * 1. ����X�Ҧ��}�G��, �T�wsister�i�H����h�ֿ}�G
		 * 2. ������sister, �w�������P���}�G�������D
		 * 3. �Y�}�G��������, �h�����ƪ��}�G����
		 * 4. �ѤU������brother 
		 */
		
		HashSet<Integer> sister = new HashSet<Integer>();
		
		int sisTotal=candies.length/2;
		int ptr =0;
		
		while(ptr<candies.length){
			if(!sister.contains(candies[ptr])) {
				sister.add(candies[ptr]);
			}
			if(sister.size()>=sisTotal) {
				return sister.size();
			}
			ptr++;
		}
		
        return sister.size();
    }
}
