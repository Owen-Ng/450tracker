package Oct11;

public class GridPath {
	
	
	public int recursion(int x, int y, int sizex, int sizey){
        if (x >= sizex){
            return 0;
        }
        if (y >= sizey){
            return 0;
        }
        
        if (x == sizex - 1 && y == sizey - 1){
            return 1;
        }
      
        int right = recursion(x + 1, y, sizex, sizey);
        int left = recursion(x, y + 1, sizex, sizey);
        return right + left;
    }
    public int uniquePathsRecursion(int m, int n) {
    	
        return recursion(0,0, n,m);
    }
    // Time: O(2^n)
    // Space: O(2^n) because we use stack space in recursion
    
    
    public int uniquePathsCombination(int m, int n) {
        int cur = m + n - 2;
        int dem = m - 1;
        double result = 1;
        
        for (int i = 1; i <= dem; i ++){
            result = result * (cur - dem + i) /i;
        
        }
        return (int) result;
    }
    // Time: O(n or m) so basically O(N)
    // Space: O(1)
   
    public int recursion(int x, int y, int sizex, int sizey, int[][] vector){
        if (x >= sizex){
            return 0;
        }
        if (y >= sizey){
            return 0;
        }
        
        if (x == sizex - 1 && y == sizey - 1){
            return 1;
        }
       if (vector[y][x] != -1) {
        	return vector[y][x];
        }else{
           int right = recursion(x + 1, y, sizex, sizey, vector);
            int left = recursion(x, y + 1, sizex, sizey, vector);
           vector[y][x] = right + left;
            return vector[y][x];
       }  
    }
    public int uniquePaths(int m, int n) {
    	int[][] vector = new int[m][n];
    	for (int i = 0; i < m; i ++) {
    		for (int j = 0; j < n; j ++) {
    			vector[i][j] = -1;
    		}
    	}
        return recursion(0,0, n,m, vector);
    }
    // Time: O(n * m)
    // Space: O(n * m)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
