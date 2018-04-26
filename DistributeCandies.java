package leetcode;

import java.util.HashSet;

public class DistributeCandies {
	public int distributeCandies(int[] candies) {
		/*
		 * 用hash set 紀錄sister有多少不同種類的糖果(candies index)
		 * 1. 先找出所有糖果數, 確定sister可以分到多少糖果
		 * 2. 先分給sister, 已先拿不同的糖果種類為主
		 * 3. 若糖果種類不足, 則拿重複的糖果種類
		 * 4. 剩下的都給brother 
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
