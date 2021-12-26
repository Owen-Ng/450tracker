package Dec23;

public class FindKthElemetnof2Sortedarray {
	public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        if (n > m){
            kthElement(arr2,arr1, m, n, k);
        }
        int l = Math.max(0, k - m); // cases where k is bigger than m. If it is bigger we should start on the second one
        int r = Math.min(n,  k);
        
        while(l <= r){
            int cut1 = (l+r)>>1;
            int cut2 = k - cut1;
            
            int left1 = cut1 == 0? Integer.MIN_VALUE: arr1[cut1 -1];
            int left2 = cut2 == 0? Integer.MIN_VALUE: arr2[cut2 -1];
            int right1 = cut1 == n? Integer.MAX_VALUE: arr1[cut1];
            int right2 = cut2== m? Integer.MAX_VALUE: arr2[cut2];
            
            if (left1 <= right2 && left2<= right1){
                return Math.max(left2, left1);
                } 
             
                if (left1 > right2){
                    r = cut1 -1;
                }else{
                    l = cut1 + 1;
                }
             
        }
            
        
        return 0 ;
        
    }// Time O(min(m,n))
	// SPace: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
