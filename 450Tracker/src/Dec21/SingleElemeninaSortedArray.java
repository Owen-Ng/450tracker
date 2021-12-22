package Dec21;

public class SingleElemeninaSortedArray {
	 public int singleNonDuplicate(int[] nums) {
	        if (nums.length == 1){
	            return nums[0];
	        }
	        int start = 0;
	        int end = nums.length -2;
	        while(start <= end){
	            int mid = (start + end)/2;
	            if (nums[mid] == nums[mid^1]){
	                start = mid +1;
	            }else{
	                end = mid - 1;
	            }
	        }
	        return nums[start];
	    }
	 // Time: O(Logn)
	 // Space: O(1)
}
