package Oct11;

import java.util.HashMap;
import java.util.Map.Entry;

public class MajorityElement {
	public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i : nums) {
        	if (mp.containsKey(i)) {
        		mp.put(i, mp.get(i) + 1);
        	}else {
        		mp.put(i, 1);
        		
        	}
        }
        int [] result = {-1,-1}; 
        for(Entry<Integer, Integer> e : mp.entrySet()) {
        	if (result[1] < e.getValue()) {
        		result[0] = e.getKey();
        		result[1] = e.getValue();
        	}
        }
        return result[0];
    }// Time: O(N) Space: O(N)
	public int OptimizedmajorityElement(int[] nums) {
        int count = 0;
        int result = 0;
        for (int i : nums){
            if (count == 0){
                result = i;
            }
            if ( result == i){
                count += 1;
            }
            else{
                count -= 1;
            } 
        }
        return result;
    }// Time: O(N) Space: O(1)
	// Intuition. Since we know there s an element which is > n/2.
	// Given the addition of the rest of the element we know that
	// the majority element will still be greater than addition of the rest.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
