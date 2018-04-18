package leetcode;
import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
        int ptr1 = m-1;
        int ptr2 = n-1;
        int ptrwt = m+n-1;
        
        while(ptr1>-1&&ptr2>-1){
          nums1[ptrwt--] = (nums1[ptr1]>nums2[ptr2])?
                         nums1[ptr1--]:nums2[ptr2--]; 
        }
        while(ptr2>-1){
          nums1[ptrwt--] = nums2[ptr2--];
        }
      
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
