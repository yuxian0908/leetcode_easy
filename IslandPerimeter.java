package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IslandPerimeter {
	public int islandPerimeter(int[][] grid) {
		int outer=0;
		int inner=0;
		int count=0;
		
		HashMap<Integer, Integer> storeHor = new HashMap<Integer, Integer>();//store horizontal item
		HashMap<Integer, Integer> storeVec = new HashMap<Integer, Integer>();//store vector item
		
		while(outer<grid.length) {

			while(inner<grid[outer].length) {
				//grid[outer][inner]-->hor
				if(grid[outer][inner]==1) {
					storeHor.put(inner, 2);
					count+=2;
					if(storeHor.containsKey(inner-1)) {
						count-=2;
					}
				}


				
				inner++;
			}
			storeHor.clear();
			inner=0;
			outer++;
		}
		outer=0;
		inner=0;
		
		
		while(inner<grid[0].length) {
			while(outer<grid.length) {
				//grid[outer][inner]-->vec
				if(grid[outer][inner]==1) {
					storeVec.put(outer, 2);
					count+=2;
					if(storeVec.containsKey(outer-1)) {
						count-=2;
					}
				}
				outer++;
			}
			storeVec.clear();
			outer=0;
			inner++;
		}

		
        return count;
    }
}
