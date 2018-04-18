package leetcode;
import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
        int pointer1 = 0;
        int pointer2 = 0;
        
        while(pointer2<n){
        	

        	System.out.println("+++++++++");
            System.out.println(Arrays.toString(nums1));
            System.out.println(Arrays.toString(nums2));
        	System.out.println("pointer1:"+pointer1);
        	System.out.println("pointer2:"+pointer2);
        	
        	if(pointer1<m+pointer2) {
        		if(nums2[pointer2]>nums1[pointer1]){
        			if(nums2[pointer2]<nums1[pointer1+1]) {
        				for(int i=m+n-1;i>pointer1;i--) {
                			nums1[i] = nums1[i-1];
                		}
                		nums1[pointer1+1] = nums2[pointer2];
                		System.out.println(nums2[pointer2]);
                		pointer2++;  
        			}else {
        				pointer1++;
        			}
        			
            		
            	}else if(nums2[pointer2]<nums1[pointer1]){
            		
            		pointer2++;
            		pointer1++;
            		
            	}else if(nums2[pointer2]==nums1[pointer1]) {
            		
            		if(nums2[pointer2]<nums1[pointer1+1]) {
        				for(int i=m+n-1;i>pointer1;i--) {
                			nums1[i] = nums1[i-1];
                		}
                		nums1[pointer1+1] = nums2[pointer2];
                		System.out.println(nums2[pointer2]);
                		pointer2++;  
        			}else {
        				pointer1++;
        			}
            		
            	}
        	}else {
        		
        	}
        	
        }

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
      
    }
}