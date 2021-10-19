package Oct14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class ReversePairs {
	public int reversePairs(int[] nums) {
        
        return merge(nums, 0, nums.length - 1);
    }
    public int merge(int[] arr, int l, int r){
        if (l>= r){
            return 0;
        }
        else{
            int m = (l + r)/2;
            int count = merge(arr, l, m);
            count += merge(arr, m + 1, r);
            count += mergesort(arr, l, m , r);
            return count;
        }
    }
    public int mergesort(int[] nums, int l, int m, int r){
        int count = 0;
        int j = m + 1; // The reason why we added one here is to make sure
        // we do not overlap with the left subarray
        // the left array is from l to m inclusive
        // the right array is from m + 1 to r inclusive
        
        
        for (int i = l; i <= m; i ++){// left subarray
            while (j <= r && nums[i] > (2 * (long) nums[j])){//right subarray
                j ++;
            }
            count += (j - (m  + 1));
        }
        //Intuition for the above
        /**
         * it iterate from the left to the midpoint
         * Then for each iteration, we are checking the right pointer and
         * check whether it satisfy the reverse condition
         * if it satisfy, the start of the right pointer (j) get incremented
         * Then after the inner for loop, the count is incremented
         * by the new incremented right pointer to the midpoint
         * meaning for each satisfy condition it will add the total of satisfied
         * condition relative to each elements in the left subarray.
         * For example,
         * arr = [2,6,8,3,5,7]
         * Left = [2,6,8] Right = [3,5,7] 
         * Lpointer = 0;
         * mid = 4
         * rPointer = 5
         * 
         * First iteration,
         * Lpointer at 0, 2 < 3 so 2 < 6, so nothing to be added to counter
         * Second iteration,
         * Lpointer at 1, 6 > 3 but 6 >= 2 * 3 so nothing
         * Third iteration,
         * Lpointer at 8, 8 > 3, 8 > 2 * 3, the mid will be incremented by 1
         * then 8 < 2 * 5 so no more increment, we have mid = 5
         * then counter will be added by mid - (original midpointer which is 4) = 1
         * 
         * 
         */
        
        
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left  = l;
        int right = m + 1; // to avoid overlapping from left array
        // Here we are creating an an array in which the subarrays will be sorted
        // into one array
        while (left <= m && right <= r){
            if (nums[left] <= nums[right]){
                temp.add(nums[left]);
                left ++;
                
            }
            else{
                temp.add(nums[right]);
                right ++;
            }
        }
        while(left <= m ){
            temp.add(nums[left]);
            left++;
        }
	    while(right <= r){
	        temp.add(nums[right]);
	        right ++;
	    }
	    
	    // Sorted till here
        for( int i = l; i <= r;i ++){
            nums[i] = temp.get(i - l);
        }
//        Then here we modify the original array from the temp
        return count;
    }
    //Time: O(NLogN)
    //Space: O(N)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
