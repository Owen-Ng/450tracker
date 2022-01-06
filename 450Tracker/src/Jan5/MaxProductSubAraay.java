package Jan5;

public class MaxProductSubAraay {
    public int maxProduct(int[] nums) {
        int currentMax = 1;
        int answer = nums[0];
        int currentMin = 1;
        
       
        for (int i = 0; i < nums.length ; i ++){
            int current = nums[i];
            int cmax = Math.max(current, Math.max(current * currentMax, current * currentMin));
            int cmin = Math.min(current, Math.min(current * currentMax, current * currentMin));
              currentMax =cmax;
              currentMin = cmin;
            answer = Math.max(answer, currentMax);
            
            
        }
        return answer;
    }
    // O(N) time O(1) space
}
