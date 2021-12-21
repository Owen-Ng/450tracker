package Dec19;

public class Sudoku {
	public void solveSudoku(char[][] board) {
        recursion(board, 0,0 );
    }
    public boolean isValid(char[][] board, int row, int col, char value){
        // check the row
        for (int r: board[row]){
            if (r == value){
                return false;
            }
        }
        for (int i = 0; i < board.length; i ++){
            if (board[i][col] == value){
                return false;
            }
        }
        int rowbox = (int) Math.floor(row/3);
        int colbox = (int) Math.floor(col/ 3);
        for (int r = rowbox * 3; r < (rowbox + 1) * 3; r++){
            for(int c = colbox * 3; c< (colbox + 1) * 3 ; c ++){
                if (board[r][c] == value){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean recursion(char[][] board, int row, int col){
        if (row == board.length){
            return true;
        }
        int newrow = row;
        int newcol = col + 1;
        if (newcol >= board.length){
            newcol = 0;
            newrow ++;
        }
        if (board[row][col] != '.'){
            return recursion(board, newrow, newcol);
        }else if (board[row][col] == '.'){
            for(int i = 1; i <= 9; i ++){
                if (isValid(board, row, col, Character.forDigit(i, 10))){
                    board[row][col] = Character.forDigit(i, 10);
                    if (recursion(board, newrow, newcol)){
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }// Time O(N*M)
    // Space: O(M) M is the space that needs to be filled in N is from 1 to 9
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
