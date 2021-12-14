package Extras;

import java.util.HashMap;
import java.util.Map;

public class AnagramValid {
	public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (Character i : s.toCharArray()){
            if (hm.containsKey(i)){
                hm.put(i, hm.get(i) + 1);
            }else{
                hm.put(i, 1);
            }
        }
        for (Character i : t.toCharArray()){
            if (hm.containsKey(i)){
                hm.put(i, hm.get(i) -1 );
            }else{
                return false;
            }
        }
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > 0){
                return false;
            }
        }

        return true;
            
    }// Time : O(N) * 3
	// Space: O(N) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
