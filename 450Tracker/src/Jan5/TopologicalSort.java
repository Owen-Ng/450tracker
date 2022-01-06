package Jan5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSort {
	 static int[] topoSortdfs(int V, ArrayList<ArrayList<Integer>> adj) 
	    {
	        // add your code here
	        Stack<Integer> stack = new Stack<Integer>();
	        boolean [] vis = new boolean[V];
	        for (int i = 0; i < V ; i ++){
	            if (vis[i] == false){
	                 
	                dfs(adj, vis, stack, i);
	            }
	        }
	        int [] answer = new int[V];
	        int index = 0;
	        while (stack.empty() == false){
	            answer[index] = stack.pop();
	            index++;
	        }
	        return answer;
	    } // Time : O(N + E) // Space O(N + E) with dfs
	    static void dfs(ArrayList<ArrayList<Integer>> adj , boolean[] vis,  Stack<Integer> stack, int i){
	        ArrayList<Integer> current = adj.get(i);
	        vis[i] = true;
	        for (Integer e : current){
	            if (vis[e] == false){
	                
	                dfs(adj, vis, stack, e);
	            }
	        }
	        stack.push(i);
	    }
	    static int[] topoSortBFS(int V, ArrayList<ArrayList<Integer>> adj) 
	    {
	        // add your code here
	       Queue<Integer> q = new LinkedList<Integer>();
	       int[] dp = new int[V];
	       for (ArrayList<Integer> i : adj){
	           for (Integer j : i){
	               dp[j] ++;
	           }
	       }
	       for (int i = 0; i < V ; i ++){
	           if (dp[i] == 0){
	               q.add(i);
	           }
	       }
	       int[] result = new int[V];
	       int index =0;
	       while (!q.isEmpty()){
	           int current = q.poll();
	           for (Integer i : adj.get(current)){
	               dp[i] --;
	               if (dp[i] == 0){
	                   q.add(i);
	               }
	           }
	           result[index] = current;
	           index++;
	           
	       }
	       return result;
	         
	    } // Time : O(N + E)
	    // Space: O(N)
}
