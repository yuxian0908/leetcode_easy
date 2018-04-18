package leetcode;

public class SearchInsertPosition {
	public static void main(String[] args) {
		SearchInsertPosition solution = new SearchInsertPosition();
		
		int[] testAry = {1,3,5,6,8,9,11,13,46};
		System.out.println(solution.searchInsert(testAry,30));
		
	}
	
	public int searchInsert(int[] nums, int target) {
		
		int high = nums.length-1;
		int low = 0;
		int index = Integer.MAX_VALUE;
		
		while(low<=high) {//binary search
			int middle = (high+low)/2;
			if(nums[middle]<target) {
				low = middle+1;
			}else if(nums[middle]>target){
				high = middle-1;
			}else if(nums[middle]==target){
				index = middle;
				break;
			}
		}
		
		if(low==high||high<low) {
			index = low;
		}
		
		
        return index;
    }
}
