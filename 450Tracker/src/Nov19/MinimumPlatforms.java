package Nov19;

import java.util.Arrays;

public class MinimumPlatforms {
	static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int plat = 1;
        int max = 0;
        int s = 1;
        int e = 0;
        
        while (s < n && e < n){
            if (arr[s] > dep[e]){
                plat--;
                e++;
            }else{
                s++;
                plat ++;
            }
            if (plat > max){
                max = plat;
            }
        }
        return max;
        
    }
	//Time : O(n + M)
	// Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
