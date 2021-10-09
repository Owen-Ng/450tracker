package Oct8;

public class Search2dmatrix {
	 public boolean searchMatrix(int[][] matrix, int target) {
	        int row = 0;
	        for (int i = 0; i < matrix.length; i ++){
	            if (matrix[i][0] <= target  ){
	                row = i;
	             }
	            else if ( matrix[i][0] > target){
	                break;
	            }
	            
	        }
	        
	        for (int i : matrix[row]){
	            if (i == target){
	                return true;
	            }
	        }
	        return false;
	    }
	 // Time : O(N + M)
	 // Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
