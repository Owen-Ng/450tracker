package Sept29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kbiggest {
	public static int result(int[] arr, int k) {
		List<Integer> stack = new ArrayList<Integer>();
		for (int i : arr) {
			

			if (stack.isEmpty()) {
				stack.add(i);
			}
			else {
				
				stack.add(i);
				System.out.println(stack.toString());
				int pos = stack.size() - 1;
				while (pos > 0 && stack.get(pos - 1) < stack.get(pos)) {
					// if position is greater than 1 and the last stack is less than the current value
					int tmp = stack.get(pos - 1);
					stack.set(pos - 1,  stack.get(pos));
					stack.set(pos, tmp);
					pos -= 1;
				}
				
				if (stack.size() > k) {
					stack =  stack.subList(0, k);
				}
					
			 
			}
		}
		System.out.println(stack.toString());
		return stack.get(k - 1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = {1,2,3};
		int[] test2 = {4,5,1,2};
		System.out.println(result(test1, 3));
		System.out.println(result(test2, 3));
	}

}
