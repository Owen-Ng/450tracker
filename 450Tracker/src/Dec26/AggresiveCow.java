package Dec26;

import java.util.Arrays;

public class AggresiveCow {
	public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 0;
        int high = position[position.length - 1]  - low;
        int result = 0;
        while ( low <= high){
            int mid = (low + high)/2;
            int count = 1;
            int helper = position[0];
            for (int i = 1; i < position.length; i ++){
                if (position[i] - helper >= mid){
                    count++;
                    helper = position[i];
                }
            }
            if (count < m){
                high = mid - 1;
            }else{
                if (result < mid){
                    result = mid;
                }
            
                low = mid + 1;
            }
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
