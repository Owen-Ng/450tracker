package Nov18;

// WHole intuition is to be at a point and check the right and left.
public class TrappingRainWater {
	public int trap(int[] height) {
        int leftmax = 0;
        int rightmax = 0;
        int result = 0;
        int L = 0;
        int R = height.length - 1;
        while(L < R){
            if (height[L] <= height[R]){
                if (height[L] >= leftmax){
                    leftmax = height[L];
                }else{
                    result += (leftmax - height[L]);
                }
                L++;
            }else{
                if (height[R] >= rightmax){
                    rightmax = height[R];
                }else{
                    result += (rightmax - height[R]);
                }
                R--;
            }
        }
        return result;
        
    }
	//Time: O(N) , Space: O(1) 
	public int noOPtrap(int[] height) {
        int[] prefix = new int[height.length];
        int[] sufix = new int[height.length];
        for (int i = 0; i < height.length; i ++){
            if (i == 0){
                prefix[0] = height[i];
            }else{
                prefix[i] = Math.max(height[i], prefix[i - 1]);
            }
            int sufix_i = height.length - i - 1;
            if (sufix_i == height.length -1 ){
                sufix[sufix_i] = height[sufix_i];
            }else{
                sufix[sufix_i] = Math.max(height[sufix_i], sufix[sufix_i + 1]);
            }
        }

        int result = 0;
        for (int i = 0; i < height.length ; i ++){
            result += Math.min(sufix[i], prefix[i]) - height[i];
        }
        return result;
        
    }
	//Time: O(N) , Space: O(N) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
