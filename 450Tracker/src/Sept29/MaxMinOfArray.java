package Sept29;

import java.util.Arrays;

public class MaxMinOfArray {
	public static int[] MinMax(int[] arr) {
		
		if (arr.length == 0) {
			int [] r = {};
			return r;
		}
		int min = (int) Double.POSITIVE_INFINITY ;
		int max = (int) Double.NEGATIVE_INFINITY;
		for (int i : arr) {
			if ( min > i) {
				min = i;
			}else if (max < i) {
				max = i;
			}
		}
		
		int [] result = {min, max};
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = {1,2,3};
		int[] test2 = {4,5,1,2};
		System.out.println(Arrays.toString(MinMax(test1)));
		System.out.println(Arrays.toString(MinMax(test2) ));
	}

}
