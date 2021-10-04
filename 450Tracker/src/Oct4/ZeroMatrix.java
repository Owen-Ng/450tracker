package Oct4;

public class ZeroMatrix {
	public void setZeroes(int[][] matrix) {
        int col = 1;
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for (int r = 0; r < rows; r ++){
            if (matrix[r][0] == 0){
                col = 0;
            }
            for (int c = 1 ; c < cols; c ++){
                if (matrix[r][c] == 0){
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }
        
        // The reason why we going inversely for changing the zero 
        // Is to prevent the first row to effect the rest of the row.
        // 
//        1 0 1   								     1 0 1	 			 0 0 0 		     0 0 0 
//        1 0 1 after the first iteration it will be 0 0 1 not inversely 0 0 0 inversely 0 0 0
//        1 1 1   									 1 1 1  			 0 0 0  		 1 0 1
        for (int r = rows -1 ; r > -1; r --){
            for (int c = cols -1 ; c > 0 ; c --){
                if (matrix[0][c] == 0 || matrix[r][0] == 0){
                    matrix[r][c] = 0;
                }
                
            }
            if (col == 0){
                matrix[r][col] = 0;
            }
        }
	}
//	Time: O(L * W)
	// Space O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
