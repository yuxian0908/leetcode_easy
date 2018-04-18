package leetcode;

public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {

    	int high = letters.length;
    	int low = 0;
    	int middle;
    	char result = 'a';
    	
    	while(high>=low) {
    		middle = (high+low)/2;

//    		System.out.println("high:"+high);
//    		System.out.println("low:"+low);
//    		System.out.println("middle:"+middle);
    		
    		if((int) target < (int) letters[middle]) {//if target < this middle
    			
    			if( (middle-1)>=0 && 
    					(int) target < (int) letters[middle-1]) {//if target < this middle-1
    				//keep search
    				high = middle-1;
    			}else {
    				result = letters[middle];
    				break;
    			}
    			
    		}else if((int) target >= (int) letters[middle]) {//if target > this middle
    			
    			if( (middle+1)<letters.length && 
    					(int) target >= (int) letters[middle+1] ) {//if target >= this middle+1
    				//keep search
    				low = middle+1;
    			}else {
    				if((middle+1)<letters.length) {
    					result = letters[middle+1];
    				}else {
    					result = letters[0];
    				}
    				
    				break;
    			}
    			
    		}
    		
    	}
    	
    	return result;
    }
}
