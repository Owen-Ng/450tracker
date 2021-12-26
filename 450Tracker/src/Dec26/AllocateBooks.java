package Dec26;

public class AllocateBooks {
	public int books(int[] A, int B) {
        // System.out.println(A.length)
		if (B > A.length){
            return -1;
        }
        int low = A[0];
        int high = 0;
        for (int i : A){
            high += i;
            low = Math.min(i, low);
        }
        int result = Integer.MAX_VALUE;
        while (low <= high){
            int mid = (low + high) /2;
            int count = 1;
            int helper = 0;
            for (int i : A){
                helper += i;
                if (helper > mid){
                    helper = i;
                    count ++;
                    if (helper > mid){
                        count = Integer.MAX_VALUE;
                        break;
                    }
                }
            }
            if (count <= B){
                result = mid;
                
                high = mid -1;
                
            }else{
                low = mid + 1;
            }
        }
        return result;
    
    }// Time O(NlogN)
	
	// Space O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
