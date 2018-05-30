package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	
    	HashMap<Integer, Integer> pair = new HashMap<>();
    	Stack<Integer> store = new Stack<>();
    	
    	for(int i=0; i<nums2.length; i++) {
    		while(!store.isEmpty()&&store.peek()<nums2[i]) {
    			pair.put(store.pop(), nums2[i]);
    		}
    		store.push(nums2[i]);
    	}
    	
    	int[] result = new int[nums1.length];
    	for(int i=0; i<nums1.length; i++) {
    		result[i] = pair.containsKey(nums1[i])?pair.get(nums1[i]):-1;
    	}
    	
        return result;
    }
}
