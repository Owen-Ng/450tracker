package Dec7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubSetSum2 {
	public List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> current = new ArrayList<Integer>();
        Arrays.sort(nums);
        recursion(nums, 0, current);
        return result;
    }
    public void recursion(int[] nums, int pointer, List<Integer> current){
        result.add(new ArrayList(current));
        HashSet<Integer> hs = new HashSet<Integer>();
        while (pointer < nums.length ){
            if (!hs.contains(nums[pointer])){
                hs.add(nums[pointer]);
                current.add(nums[pointer]);
                recursion(nums, pointer + 1, current);
                current.remove(current.size() -1);
                
            }
            pointer++;
        }
        hs.clear();
    }
    // Time : O(2**N * N) extra N for doing a deep copy at new ArrayList(current)
    // Space: O(2**N * N) The extra N is for storing hashset
}
