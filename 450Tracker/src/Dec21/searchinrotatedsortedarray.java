package Dec21;

public class searchinrotatedsortedarray {
	public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        while( l <= h){
            int mid = (l+h)/2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] >= nums[l]){
                if(nums[l] <= target && nums[mid]  >= target){
                    h = mid - 1;
                }else{
                    l = mid + 1 ;
                }
            }else{
                if (nums[mid] <= target && nums[h] >= target){
                    l = mid + 1;
                }else{
                    h = mid - 1;
                }
            }
                
            
        }
        return -1;
    }// Time : O(logn)
	// Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}