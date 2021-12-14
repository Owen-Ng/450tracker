package Dec1;

public class MinCoins {
	public static int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	    int[] dp = new int[V + 1];
	    dp[0] = 0;
	    for (int i = 1; i < V + 1; i ++){
	        dp[i] = Integer.MAX_VALUE;
	    }
	    for (int i = 1; i < V + 1; i ++){
	        for (int j = 0; j < M; j ++){
	            if (coins[j] <= i){
	                int res = dp[i - coins[j]];
	                System.out.println(i - coins[j]);
	                System.out.println("HO");
	                System.out.println(res);
	                
	                if (res != Integer.MAX_VALUE){
	                    dp[i] = Math.min(dp[i], res + 1);
	                }
	            }
	        }
	    }
	    	if (dp[V] == Integer.MAX_VALUE){
        	    return -1 ;
        	}
	return dp[V];
	} //Time: O(V * M)
	//Space: O(V)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9, 6, 5, 1} ;
		System.out.println(minCoins(arr , 4, 11));
	}

}
