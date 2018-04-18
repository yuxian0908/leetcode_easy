package leetcode;
import java.util.Arrays;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		
		int compareIndex = 0;
		int writeIndex = 0;
		
		while(compareIndex<nums.length) {
			
			if(nums[compareIndex]!=val) {
				
				nums[writeIndex] = nums[compareIndex];
				compareIndex++;
				writeIndex++;
				
			}else if(nums[compareIndex]==val) {
				
				compareIndex++;
				
			}
			
		}
		
		
        return writeIndex;
    }
}
