package Dec19;

import java.util.ArrayList;

public class RatInMaze {
	 private static void solve(int i, int j, int a[][], int n, ArrayList<String> ans
			    ,String move
			    ) {
			        if(i==n-1 && j==n-1) {
			            ans.add(move);
			            return; 
			        }
			        //down
			        if(i+1<n   && a[i+1][j] == 1) {
			            a[i][j] = -1; 
			            solve(i+1, j, a, n, ans, move + 'D' );
			            a[i][j] = 1; 
			        } 
			        // left
			        if(j-1>=0   && a[i][j-1] == 1) {
			           a[i][j] = -1; 
			            solve(i, j-1, a, n, ans, move + 'L' );
			            a[i][j] = 1; 
			        } 
			        // right 
			        if(j+1<n   && a[i][j+1] == 1) {
			            a[i][j] = -1; 
			            solve(i, j+1, a, n, ans, move + 'R' );
			            a[i][j] = 1; 
			        } 
			        // upward
			        if(i-1>=0   && a[i-1][j] == 1) {
			            a[i][j] = -1; 
			            solve(i-1, j, a, n, ans, move + 'U' );
			            a[i][j] = 1; 
			        }
			    }//Time O(N * M)
	 			// Space O(N * m)
			    public static ArrayList<String> findPath(int[][] m, int n) { 
			        ArrayList<String> ans = new ArrayList<>(); 
			        if(m[0][0] == 1) solve(0, 0, m, n, ans, "" ); 
			        return ans; 
			    }
	 

}
