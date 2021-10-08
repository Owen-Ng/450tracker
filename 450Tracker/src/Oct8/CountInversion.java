package Oct8;
/*
 * Count the number of pairs such that each pairs
 * [i,j] where i < j index's elements pairs[i] > pair[j]
 * 
 */
public class CountInversion {
	public static int merge(int[] arr, int[] tmp, int start, int mid, int end) {
		
		int left = start;
		int right = mid;
		int result = start;
		int inverse = 0;
		while (  (left <= mid - 1) && (right <= end)) {
			if (arr[left] <= arr[right]) {
				tmp[result++] = arr[left++];
				
			}else {
				
				tmp[result++] = arr[right++];

				inverse += (mid - left);
			}
		}
		
		while (left <= mid - 1) {
			tmp[result++] = arr[left++];
		}
		while (right <= end) {
			tmp[result++] = arr[right++];
		}
		for (int i = start; i <= end ; i ++) {
			arr[i] = tmp[i];
		}
		return inverse;
	}
	public static int mergesort(int[] arr, int[] tmp, int start, int end) {
		int inverse = 0;
		
		if (start < end) {
			int mid = (start  + end) /2;
			inverse += mergesort(arr, tmp, start, mid);
			inverse += mergesort(arr, tmp, mid + 1, end);
			
			inverse += merge(arr, tmp, start, mid + 1, end);
		}
		return inverse;
	}
//Time: O(NlogN)
	// Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {5,3,2,4,1};
		int[] tmp = new int[test.length];
		int result = mergesort(test, tmp, 0, test.length - 1 );
		System.out.println(result);
		System.out.println("Finished");
		
	}

}
