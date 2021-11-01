package Oct18;
//https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
import java.util.HashMap;

public class LargestSubArraywithOSum {
	public static int LargestSubWithZeroSum(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int sum = 0;
		int max = 0;
		
		for (int i = 0; i < nums.length; i ++) {
			sum += nums[i];
			if (sum == 0) {
				int current = i + 1;
				if (current > max) {
					max = current;
				}
			}
			else if (hm.containsKey(sum)) {
				int current = i - hm.get(sum);
				if (current > max) {
					max = current;
				}
			}else {
				hm.put(sum, i);
			}
		}
		
		return max;
		
		
	}
	// Time: O(NLogN) Did not realize that Hashmap contains take O(LogN) Complexity I thought it was
	// always constant.
	// Space: O(N)
	// Update: The time must be O(1) if the hash function was made properly
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A  = {15,-2,2,-8,1,7,10,23};
		System.out.println(LargestSubWithZeroSum(A));
		int[] A1  = {15,-2,2,-8,1,7,10,23, -48};
		System.out.println(LargestSubWithZeroSum(A1));

	}

}
