package Oct8;

public class BuySelStock {
	 public int maxProfit(int[] prices) {
	        int index = 0;
	        int sum = 0;
	        
	        for (int i = 0; i < prices.length; i ++){
	        	/*
	        	 * Alternatively:
	        	 * we can take the minimum of the price of each iteration
	        	 * and maximum of price for each iteration
	        	 */
	            if ((prices[i] > prices[index])){
	                sum = Math.max(prices[i] - prices[index], sum);
	            }
	            if (prices[i] < prices[index]){
	                index = i;
	                
	            }
	        }
	        
	        return sum;
	    }
	 //Time: O(N)
	 // Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
