package Jan5;

import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
	public boolean isBipartitebfs(int[][] graph) {
        int V = graph.length;
        int[] color = new int[V];
        for (int i = 0; i < V ; i++){
            color[i] = -1;
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for (int j = 0; j < V ; j++){
            if (color[j] == -1){
                q.add(j);
                color[j] = 1;
                while (!q.isEmpty()){
                    int current = q.poll();
                    int cColor = color[current];

                    if (cColor == 1){
                        cColor = 0;
                    }else{
                        cColor = 1;
                    }

                    for(int i : graph[current]){
                        if (color[i] == -1){

                            q.add(i);
                            color[i] = cColor;
                        }else if ( color[i] != cColor) {
                             return false;
                        }
                    }

                }
            }
        }
        return true;
    }// TIme and Space: O(n + e)
	
	public boolean isBipartiteDFS(int[][] graph) {
        int V = graph.length;
        int[] color = new int[V];
        for (int i = 0; i < V ; i++){
            color[i] = -1;
        } 
        for (int j = 0; j < V ; j++){
            if (color[j] == -1){
                color[j] = 1;
                if (dfs(color, j, graph) == false){
                    return false;
                }
            }
        }
        return true;
    }// Time and Space: O(N + E) 
    public boolean dfs(int[] color, int current, int[][] graph){
        for (int i: graph[current]){
            if (color[i] == -1){
                
                if(color[current] == 1){
                    color[i] = 0;
                }else{
                    color[i] = 1;
                }
                if (dfs(color, i, graph) == false){
                    return false;
                }
            }else{
                if (color[i] == color[current]){
                    return false;
                }
            }
            
        }
        return true;
    }
}
