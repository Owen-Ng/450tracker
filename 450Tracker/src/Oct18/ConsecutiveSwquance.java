package Oct18;

import java.util.Arrays;
import java.util.HashSet;

public class ConsecutiveSwquance {
	public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int result = 1;
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length - 1; i ++){
            if ( nums[i + 1] - nums[i]  == 1){
                count += 1;
            }else if (nums[i + 1] - nums[i]  == 0){
            }
            else{
                count = 1;
            }
            
            if (result < count){
                result = count;
            }
        }
        return result;
    }
	// Time: O(NLogN) + O(N) = O(N LogN)
	// Space: O(1) Still pretty slow need to aim for O(N)
	
	public int ONlongestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        
        HashSet<Integer> h = new HashSet<Integer>();
        for (int i : nums){
            h.add(i);
        }// O(n)
        int count = 1;
        int result = 1;
        for (int i: nums){
            if (h.contains(i) && h.contains(i - 1)){
                continue;
            }
            int oldi = i;
            while(h.contains(i + 1)){
                count += 1;
                i++;
            }
            i = oldi;
            if (result < count){
                result = count;
            }
            
            count = 1;
        }
    return result;
    }// Here is a good example where Lower time complexity is slower than higher complexity. Well
	// in terms of big O notation
	// Time: O(N) + O(N) + O(N) = O(3N) = O(N) 
	// Since it is in a hashset with not duplicate we can have a maximum of O(N) runtime in the inner loop
	// So this cannot be O(N^2) + O(N) instead is O(N) + O(N) + O(N)
	// Space: O(N)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
