package Oct15;

import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i= 0 ; i < nums.length ; i ++){
            int current = Math.abs(target - nums[i]);
            if (mp.containsKey(current)) {
            	int [] arr = {mp.get(current), i};
            	return arr;
            }else {
            	mp.put(current, i);
            }
        }
        int[] arr = {};
        return arr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
