package Nov18;
//Intuition 2 pointer 
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/
public class removediuplicatesortedarray {
	public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int start = 0;
        int end = 1;
        int result=1;
        while (end < nums.length){
            if (nums[start] == nums[end]){
                end ++;
            }else{
                start ++;
                nums[start] = nums[end];
                end++;
                result ++;
            }
        }
        return result;
    }
	// Time: O(N)
	// Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
