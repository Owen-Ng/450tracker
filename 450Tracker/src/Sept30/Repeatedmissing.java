package Sept30;

import java.util.Arrays;
import java.util.HashMap;

public class Repeatedmissing {
	public static int[] result(int[] arr){
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for ( int  i = 1; i <= arr.length; i ++) {
			if (hm.get(i) == null) {
				hm.put(i, 0);
			}
			
			if (hm.get(arr[i - 1]) == null) {
				hm.put(arr[i - 1], 0);
			}
			hm.put(arr[i - 1], hm.get(arr[i -1 ]) + 1);
			
		}
		int missing =0;
		int repete = 0;
		for ( int  i = 1; i <= arr.length; i ++) {
			if (hm.get(i) == 0) {
				missing = i;
			}
			
			if (hm.get(i) >1 ) {
				repete = i;
			}
			
		}
		System.out.println(hm.toString());
		int [] ans = {missing, repete};
		return ans;
	}
	// Time: O(N)
	// Space : O(n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = {3, 1, 3};
		int [] test2 =  {4, 3, 6, 2, 1, 1};
		
		System.out.println(Arrays.toString(result(test1)));
		System.out.println(Arrays.toString(result(test2)));
	}

}
