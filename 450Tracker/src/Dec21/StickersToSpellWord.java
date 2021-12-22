package Dec21;

import java.util.ArrayList;
import java.util.HashMap;

public class StickersToSpellWord {
	 public int result = -1;
	    public int minStickers(String[] stickers, String target) {
	 
	        if (target.length() == 0){
	            return 0;
	        }
	        
	        ArrayList<HashMap<Character, Integer>> arr = new ArrayList<HashMap<Character, Integer>>();
	        for (String s: stickers){
	            HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	            for (char i: s.toCharArray() ){
	                if (hm.get(i)!= null){
	                    hm.put(i, hm.get(i) +1);
	                }else{
	                    hm.put(i, 1);
	                }
	            }
	            arr.add(hm);
	        }
	        recursion(arr, target, 0);
	        return result;
	    }
	    public void recursion(ArrayList<HashMap<Character, Integer>> stickers, String target, int current){
	        
	        if (target.length() == 0 && (result > current || result == -1)){
	            result = current;
	        }else if ((current < result ||result == -1) && target.length() > 0){ 

	            for ( HashMap<Character, Integer>  s : stickers){ //O(k)
	                HashMap<Character, Integer> hm = new HashMap<Character, Integer>(s); // O(N)
	                boolean tf = false; 
	                String tmptarget = target;
	                for (int i = target.length()- 1; i >= 0; i-- ){
	                    if (hm.get(target.charAt(i)) != null && hm.get(target.charAt(i)) > 0){
	                        hm.put(target.charAt(i), hm.get(target.charAt(i)) -1);
	                        target = target.substring(0, i) + target.substring(i + 1, target.length());
	                        tf = true;
	                    }
	                }
	                if (tf == true){
	                    recursion(stickers, target, current + 1); // O(N!)
	                }
	                target = tmptarget;
	                
	            }
	        }
	    }//Time O(K*N!)
	    //Space O(N) Too slow 35/101
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
