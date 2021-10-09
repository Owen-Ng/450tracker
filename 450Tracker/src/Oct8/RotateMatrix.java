package Oct8;

public class RotateMatrix {
	public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i ++){
            for (int j = i; j < matrix[0].length; j ++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for ( int i = 0 ; i <matrix.length; i ++){
            int start = 0;
            int end = matrix[i].length - 1;
            while (start < end){
                int tmp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = tmp;
                start ++;
                end--;
            }
        }
    }
	// Time: O(N^2)
	// Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
