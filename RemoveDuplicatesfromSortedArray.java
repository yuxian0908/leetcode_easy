package leetcode;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
		
		//two pointers both start from left side and one is to compare the other is to write, 
		//if the compare pointer is different from old one, means a new number show up
		
		int compareIndex = 0;
		int writeIndex = 0;
		
		while(compareIndex<nums.length) {
			System.out.println("###########################");

			System.out.println("compareIndex:"+compareIndex);
//			System.out.println("nums[compareIndex]:"+nums[compareIndex]);
			System.out.println("writeIndex:"+writeIndex);
//			System.out.println("nums[writeIndex]:"+nums[writeIndex]);
			System.out.println(Arrays.toString(nums));
			System.out.println("###########################");
			
			
			if(compareIndex==0) {
				nums[writeIndex] = nums[compareIndex];
				compareIndex++;
				writeIndex++;
			}else if(nums[compareIndex]!=nums[compareIndex-1]) {
				nums[writeIndex] = nums[compareIndex];
				compareIndex++;
				writeIndex++;
			}else if(nums[compareIndex]==nums[compareIndex-1]) {
				compareIndex++;
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
        return writeIndex;
    }
}
