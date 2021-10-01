package Sept29;

import java.util.Arrays;

public class ReverseArrayString {
	public static int[] reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int tmp = arr[end];
			arr[end] = arr[start];
			arr[start] = tmp;
			start ++;
			end --;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = {1,2,3};
		int[] test2 = {4,5,1,2};
		System.out.println(Arrays.toString(reverse(test1)));
		System.out.println(Arrays.toString(reverse(test2) ));
	}

}
