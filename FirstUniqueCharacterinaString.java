import java.util.HashMap;

class FirstUniqueCharacterinaString{
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> store = new HashMap<Character,Integer>();
        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            if(store.containsKey(c)){
                store.put(c, store.get(c)+1);
            }else{
                store.put(c,1);
            }
        }
        int res = -1;
        for(int j=0; j<s.length(); j++){
            if(store.get(s.charAt(j))==1){
                res = j;
                break;
            }
        }

        return res;
    }
}