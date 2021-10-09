package Oct8;

public class Stoackbuysell {
	  public int maxProfit(int[] prices) {
	        int index = 0;
	        int sum = 0;
	        
	        for (int i = 0; i < prices.length; i ++){
	            if ((prices[i] > prices[index])){
	                sum = Math.max(prices[i] - prices[index], sum);
	            }
	            if (prices[i] < prices[index]){
	                index = i;
	                
	            }
	        }
	        
	        return sum;
	    }
	  // O(n) Time
	  // Space O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
