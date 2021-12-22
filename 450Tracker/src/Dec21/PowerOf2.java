package Dec21;

public class PowerOf2 {
	public boolean isPowerOfTwo(int n) {
        // 16 4
        // 8 3
        // 4 2
        // 2 1
        // 1 0
        int l = 0;
        int r = n/2;
        while (l <= r){
            int mid = (l + r)/2;
            if (Math.pow(2, mid) == n){
                return true;
            }
            if (Math.pow(2, mid) < n){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
            
        }
        return false;
        
    }// Time: O(logn)
	// Space: O(1)
}
