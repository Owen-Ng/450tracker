package Nov15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Threesum {
	public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i : nums){
            if (hm.get(i) == null){
                hm.put(i, 1);
            }else{
                hm.put(i, hm.get(i) + 1);
            }
        }
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        Set<List<Integer>> hash_Set = new HashSet<List<Integer>>();
        
        for (int i = 0; i < nums.length - 1; i ++){
            hm.put(nums[i], hm.get(nums[i]) - 1);
            for (int j = i + 1; j < nums.length ; j ++){
                hm.put(nums[j], hm.get(nums[j]) - 1);
                int current = -(nums[i] + nums[j]);
                 if (hm.get(current) != null && hm.get(current) > 0){
                     List<Integer> r = new ArrayList<Integer>();
                     r.add(nums[i]);
                     r.add(nums[j]);
                     r.add(current);
                     r.sort(null);
                     hash_Set.add(r);
                 }
                hm.put(nums[j], hm.get(nums[j]) + 1);
            }
            hm.put(nums[i], hm.get(nums[i]) + 1);
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>(hash_Set);
        return res;
    }
	// Time: O(N^2 logn) add to hashset rarely log n (worst case) but mostly O(1)
	// Space: O(N) + O(M)
	
	public List<List<Integer>> OPthreeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        for (int i = 0; i < nums.length - 2; i ++){ // avoid duplication.
            if (i == 0 || i> 0 && nums[i] != nums[i -  1]){
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high){
                if (nums[i] + nums[low] + nums[high] == 0){
                    List<Integer> r = new ArrayList<Integer>();
                    r.add(nums[i]);
                    r.add(nums[low]);
                    r.add(nums[high]);
                    res.add(r);
                    while (low < high && nums[low] == nums[low + 1]) low++;
                    while (low < high &&  nums[high] == nums[high - 1]) high--;
                    low ++;
                    high--;
                }else if (nums[i] + nums[low] + nums[high] < 0){
                    low++;
                }else if ( nums[i] + nums[low] + nums[high] > 0){
                    high--;
                }
            }
                }
        }
        return res;
    }
	// Time: O(N*2)
	// Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
