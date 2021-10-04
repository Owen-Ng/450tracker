package Oct4;

import java.util.ArrayList;
import java.util.List;

public class PascalTraignle {
	public static int combination(int r ,int c) {
//		rCc = r* r- 1 * .... / c*... * 1
		// 5 C 4 = 5 * 4 * 3 * 2 / 4 * 3* 2 * 1
		int den = 1;
		int num = 1;
		int cc = c;
		for ( int i = 1; i <= cc; i ++ ) {
			den *= c;
			num *= r;
			c-= 1;
			r -= 1;
			
		}
		return num/den;
				
	}
	public static int getValue(int row, int col) {
		// the value will be r-1Cc-1
		return combination(row - 1, col -1);
		//O(N) Time O(1) Space
	}
	public static List<Integer> getRow(int row) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 1; i <= row; i ++) {
			result.add(combination(row - 1, i - 1));
		}
		return result;
		//O(N) Time O(N) Space
		
	}
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> first = new ArrayList<Integer>();
        first.add(1);
        result.add(first);
         
        for (int i =2; i < numRows + 1; i ++){
            List<Integer> current = new ArrayList<Integer>();
            
            for ( int j = 0 ; j < i; j ++){
                if (j == i - 1){
                    current.add(1);
                }
                else if (j == 0){
                    current.add(1);
                }else{
                    List<Integer> previous = result.get(i - 2);
                    int p = previous.get(j - 1);
                    int n = previous.get(j);
                        
                    current.add(p + n);
                }
            }
            result.add(current);
        }
        return result;
    }
	// Time: O(N * N)
	// Space: O(N  * N)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(getValue(5,3));
        System.out.println(getRow(5).toString());
        
	}

}
