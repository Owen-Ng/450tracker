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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
