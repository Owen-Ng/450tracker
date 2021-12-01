package Nov18;
//https://leetcode.com/problems/max-consecutive-ones/
public class maxconsecutiveones {
	public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int current = 0;
        for (int i = 0 ; i < nums.length; i ++){
            if (nums[i] == 1){
                current ++;
                if (current > result){
                    result = current;
                }
            }else{
                current = 0;
            }
        }
        return result;
    }// Time: O(N) Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		{1,3,0,5,8,5}
//		
//		{0,1,3,5,5,8}
//		{2,4,6,7,9,9}
//		{0,2} {3,4} {5,6}.args {8,9}
	}

}
