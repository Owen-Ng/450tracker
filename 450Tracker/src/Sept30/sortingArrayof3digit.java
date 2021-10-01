package Sept30;

import java.util.Arrays;

public class sortingArrayof3digit {
	public static int[] sort3(int[] arr){
		// 3 1 2 3 2 1
		int low= 0;
		int mid = 0;
		int high = arr.length - 1 ;
		
		while ( mid < high) {
			if (arr[mid] == 1) {
				mid ++;
			}
			if (arr[mid] == 0) {
				int tmp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = tmp;
				mid ++;
				low ++;
			}
			if (arr[mid] == 2) {
				int tmp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = tmp;
				mid ++;
				high --;
				
			}
		}
		return arr;
		// Time Complexity: O(n)
		// Space complexity: O(1)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = {0, 1, 2, 0, 2, 1};
		System.out.println(Arrays.toString(sort3(test1)));
	}

}
