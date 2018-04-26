package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class NumberofBoomerangs {
	public int numberOfBoomerangs(int[][] points) {
		//遍歷points 在每個點時計算跟其他任意點距離 存進hashset 
		//若相同 則count+2並remove 該資料
		//若無相通 則直接存進set
		HashMap<Integer,Integer> storeDis = new HashMap<Integer,Integer>();
		
		int outer=0;
		int inner=0;
		int count = 0;
		while(outer<points.length) {

			System.out.println("outer:"+outer);
			
			while(inner<points.length) {
				int distance = getDistance(points[outer],points[inner]);
				int thisCount=1;
				if(storeDis.containsKey(distance)){
					thisCount = storeDis.get(distance);
					count+=thisCount*2;
					thisCount++;
				}
				storeDis.put(distance,thisCount);
				inner++;
				
				System.out.println("distance:"+distance);
				System.out.println("storeDis:"+storeDis.toString());
				System.out.println("count:"+count);
				
			}
			storeDis.clear();
			
			System.out.println("================================");
			
			inner = 0;
			outer++;
		}
		
        return count;
    }
	
	private int getDistance(int[] point1,int[] point2) {
		int dx = point1[0]-point2[0];
		int dy = point1[1]-point2[1];
		return dx*dx+dy*dy;
	}
}
