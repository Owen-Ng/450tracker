package Oct18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/4sum/
public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
	       for (int i = 0; i < nums.length; i ++){
               for (int j = i + 1 ; j < nums.length; j ++){
                   int target_2 = target - nums[i] - nums[j];
                   int start = j + 1;
                   int end = nums.length - 1;
                   
                   while (start < end){
                       if (nums[start] + nums[end] < target_2){
                           start++;
                       }
                       else if (nums[start] + nums[end] > target_2){
                           end--;
                       }
                       else{
                           List<Integer> sub = new ArrayList<Integer>();
                           sub.add(nums[i]);
                           sub.add(nums[j]);
                           sub.add(nums[start]);
                           sub.add(nums[end]);
                           result.add(sub);
                           
                           while( start < end && sub.get(2) == nums[start  ] ){
                               start++;
                           }
                           while( start < end && sub.get(3) == nums[end ] ){
                               end --;
                           }
                       }
                        
                   }
                   
                   while(j < nums.length -1 && nums[j] == nums[j + 1]){
                       j++;
                   }
                   
                   
               }
               while (i < nums.length -1 && nums[i] == nums[i + 1] ){
                       i ++;
               }
           }
        return result;
	    }
	// Time: O(N^3)
	// Space: O(N)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
