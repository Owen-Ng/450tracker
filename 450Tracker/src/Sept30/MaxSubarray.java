package Sept30;

public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int i  = 0; i < nums.length;i ++){
            sum += nums[i];
            if (sum > max){
                max = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return max;
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        // Kandan Algo
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
