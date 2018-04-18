package leetcode;
import java.util.Arrays;

public class TwoSumII {
	public static void main(String[] args) {
		TwoSumII solution = new TwoSumII();
		
		int[] testAry = {1,2,3,4,4,9,56,90};
		System.out.println(Arrays.toString(solution.twoSum(testAry,8)));
		
	}
	
	public int[] twoSum(int[] numbers, int target) {
		
		int p1 = 0;
		int p2 = numbers.length-1;
		
		while(p2>p1) {
			if(numbers[p2]+numbers[p1]<target) {
				p1 = p1+1;
			}else if(numbers[p2]+numbers[p1]>target){
				p2 = p2-1;
			}else if(numbers[p2]+numbers[p1]==target){

				return new int[] {p1, p2}; 
			}
		}
		throw new IllegalArgumentException("No two sum solution");
    }
}
