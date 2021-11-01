package Oct25;

import java.util.HashMap;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
public class LongestSubstring {
	 public int lengthOfLongestSubstring(String s) {
	        
	        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	        int count = 0;
	        int max = 0;
	        int section = 0;
	        char[] cc = s.toCharArray();
	        for (int i = 0; i< cc.length; i ++){//O(N)
	            if (hm.containsKey(cc[i])){ //O(1)
	                int tmp = hm.get(cc[i]); //O(1)
	                section = Math.max(tmp, section);
	            }
	            hm.put(cc[i], i + 1);
	            count = i + 1 - section;
	            
	            if (count > max){
	                max = count;
	            }
	        }
	        return max;
	      
	    }
	 //Time: O(n) 
	 // Space: O(N)
	 // Ok many argue hashmap being O(1) or O(LogN) A bad hashmap function will
	 // give O(LogN) in worst case but more generally hashmap is O(1)
	 // In theory, Hashmap is inserted with an hashcode which is associated with
	 // the The key so when we call get we looking using the hashcode which is
	 // immeditate.
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
