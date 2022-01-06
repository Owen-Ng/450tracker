package Jan5;

public class NumberOfIslands {
	public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length; 
        int result = 0;
        for ( int i = 0; i < row; i ++){
            for (int j = 0; j < col; j ++){
                if ( grid[i][j] == '1'){
                    result += dfs(i,j, grid); 
                }
            }
        } 
        return result; 
    }
    public int dfs(int row, int col, char[][] grid ){
         if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0'){
             return 0;
         } 
        grid[row][col] = '0';
        
        dfs(row + 1, col, grid);
        dfs(row - 1 , col, grid);
        dfs(row , col + 1, grid);
        dfs(row , col - 1, grid);
        return 1;
         
    }
    // Time O (N* M)
    // Space O(1)
}
