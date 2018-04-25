package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import java.util.List;

public class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        
    	List<Integer> list = new ArrayList<>();
    	
        int[] hash = new int[256]; 
        if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
        for (char c : p.toCharArray()) {
            hash[c]++;
        }
        
        int left = 0, right = 0, count = p.length();
        
        while(right<s.length()) {
        	if(hash[s.charAt(right++)]-->=1) {
        		count--;
        	}
        	if(count==0) {
        		list.add(left);
        	}
        	if(right-left==p.length()&&hash[s.charAt(left++)]++>=0) {
        		count++;
        	}
        }
    	
    	return list;
    }
}
