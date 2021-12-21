package Dec19;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
	  public List<List<String>> result = new ArrayList<List<String>>();
	    public List<List<String>> solveNQueens(int n) {
	        List<String> board = new ArrayList<String>();
	        for(int i = 0; i < n; i ++){
	            String s = "";
	            for (int j = 0; j < n; j ++){
	                s+= ".";
	            }
	            board.add( s);
	        }
	        recursion(board, 0);
	        return result;
	        
	    }//T(n) = n*T(n-1) + O(n^2) Approx O(N)
	    // Space O(N)
	    public void recursion(List<String> board, int row ){
	        if (row == board.get(0).length()){
	            result.add(new ArrayList(board));
	            return;
	        }
	        
	        for (int i = 0; i < board.size() ; i ++){
	                    if (board.get(row).charAt(i) == '.'){
	                        if (checkValidspot(board, row, i)){ // O(N)
	                            String tmp = board.get(row);
	                            String rtmp = "";
	                                rtmp = tmp.substring(0, i) + "Q" + tmp.substring(i + 1, tmp.length());
	                            board.set(row, rtmp);
	                            // List<String> copy = new ArrayList(board); // O(N)
	                            // copy.set(row, rtmp);
	                            recursion(board, row + 1 ); 
	                            board.set(row, tmp);

	                    }
	            }
	        }
	 
	    }
	    public boolean checkValidspot( List<String>  board, int row, int col){
	        String rows = board.get(row);
	        for (int i = 0; i < rows.length(); i ++){
	            if (board.get(row).charAt(i) != '.' ){
	                return false;
	            }
	        }
	        for (int i = 0; i < board.size(); i ++){
	            if (board.get(i).charAt(col) != '.'){
	                // System.out.println("error");
	                return false;
	            }
	        }
	        int tmprow = row;
	        int tmpcol = col;
	        while (tmprow < board.size() && tmpcol < board.get(0).length()){
	            if (board.get(tmprow).charAt(tmpcol) != '.'){
	                return false;
	            }
	            tmprow ++;
	            tmpcol++;
	        }
	          tmprow = row;
	         tmpcol = col;
	        while (tmprow >= 0 && tmpcol >= 0){
	            if (board.get(tmprow).charAt(tmpcol) != '.'){
	                return false;
	            }
	            tmprow --;
	            tmpcol--;
	        }
	          tmprow = row;
	         tmpcol = col;
	        while (tmprow >= 0 && tmpcol < board.get(0).length()){
	            if (board.get(tmprow).charAt(tmpcol) != '.'){
	                return false;
	            }
	            tmprow --;
	            tmpcol++;
	        }
	        tmprow = row;
	         tmpcol = col;
	         while (tmprow >= 0 && tmpcol < board.get(0).length()){
	            if (board.get(tmprow).charAt(tmpcol) != '.'){
	                return false;
	            }
	            tmprow --;
	            tmpcol++;
	        }
	        tmprow = row;
	         tmpcol = col;
	         while (tmprow < board.size() && tmpcol >= 0){
	            if (board.get(tmprow).charAt(tmpcol) != '.'){
	                return false;
	            }
	            tmprow ++;
	            tmpcol--;
	        }
	        return true;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
