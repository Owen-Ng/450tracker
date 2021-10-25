package Oct25;

import java.util.HashMap;

public class SubarrayXOR {
	/*
	 * Intuition: 
	 * We keep track the xor from start to an index
	 * for each iteration, 
	 * we need to find within the start to end how many times
	 * within subarrays of the xor the target was achieved.
	 * 
	 *  {a,b,c,d,e} = xor
	 *  f = t
	 *  y can be anything from this array and the rest x = can be the
	 *  remaining of the array
	 *  so, to get which value we are looking for we need to find
	 *  the y = xor^target
	 *  if y existe then we find how many was there then given the count
	 *  we count to the count result
	 */
	public static int solution(int[] arr, int target) {
		int count = 0;
		int xor = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : arr) {
			xor ^= i;
			int y = xor ^ target;
			if (xor == target) {
				count +=1;
			}
			if (hm.containsKey(y)) {
				count += hm.get(y);
			}
			if (hm.containsKey(xor)) {
				hm.put(xor, hm.get(xor) + 1);
			}
			else {
				hm.put(xor, 1);
			}
			
		}
		return count;
	}
	//Time: O(N)
	//Space: O(N)
	public static int bfsolution(int[] arr, int target) {
		int count = 0;
		
		for (int i = 0; i < arr.length; i ++) {
			int xor = 0;
			
			for (int j = i ; j < arr.length; j ++) {
				xor ^= arr[j];
				if (xor == target) {
					count ++;
				}
			}
		}
		return count;
	}// This is just for each position of the index i's of the array it check from
	// all i's to the end of the array
	//Time: O(N^2)
	// Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 2, 2, 6, 4};
		int m = 6;
		System.out.println(solution(arr, m));
		System.out.println(bfsolution(arr, m));
		 int[] arr1 = {5, 6, 7, 8, 9};
		 m = 5;
		System.out.println(solution(arr1, m));
		System.out.println(bfsolution(arr1, m));
	}

}
