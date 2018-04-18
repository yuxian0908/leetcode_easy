package leetcode;

public class StrStr {
	public int strStr(String haystack, String needle) {
				
		if(needle.length()==0) {
			return 0;
		}
		
		int pointerHay = 0;
		int pointerNee = 0;
		
		while(pointerHay<haystack.length()) {
			
			System.out.println("pointerNee:"+pointerNee);
			System.out.println("pointerHay:"+pointerHay);
			System.out.println("############");
			
			if(haystack.charAt(pointerHay) == needle.charAt(pointerNee)) {
				pointerHay++;
				pointerNee++;
			}else {
				pointerHay=pointerHay-pointerNee+1;
				pointerNee = 0;
			}
			if(pointerNee==needle.length()) {
				return pointerHay-pointerNee;
			}
		}
		
        return -1;
    }
}
