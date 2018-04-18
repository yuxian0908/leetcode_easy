package leetcode;

import java.util.concurrent.SynchronousQueue;


public class ValidPerfectSquare {
  public static void main(String[] args) {
   System.out.println("ttt");
   Solution sol = new Solution();
   System.out.println(sol.isPerfectSquare(155555554));
   
  }
  
}

class Solution {
    public boolean isPerfectSquare(int num) {
      
      long high = num;
      long low = 0;
      long middle;
      
      
      while(high>=low){
        
        middle = (high+low)/2;
        
        if(middle*middle>num){
          high = middle-1;
        }else if(middle*middle<num){
          low = middle+1;
        }else if(middle*middle==num){
          return true;
        }else if(low>=high){
          break;
        }
        
      }
      
      return false;
    }
}
