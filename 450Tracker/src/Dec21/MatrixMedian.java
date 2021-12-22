package Dec21;

public class MatrixMedian {
	 public int countmax(int[] row, int mid){
	        int l = 0;
	        int h = row.length - 1;
	        while (l <= h){
	            int md =   (l + h) /2;
	            if (row[md] <= mid){
	                l = md + 1;
	            }else{
	                h = md -1;
	            }
	        }
	        return l;
	    }
	    public int findMedian(int[][] A) {
	         
	        int start= Integer.MIN_VALUE;
	        int end = Integer.MAX_VALUE; 
	        int n = A.length;
	        int m = A[0].length;
	         
	        while(start <= end){
	            int mid = (start + end)/2;
	            int count = 0;
	            for (int i = 0; i < n; i++){
	                count+= countmax(A[i], mid);
	            }
	            if (count <= (n * m)/2) start = mid + 1;
	            else end = mid - 1;
	            
	        }
	        return start;
	    }// Time: O(nlogn)
	    // space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
