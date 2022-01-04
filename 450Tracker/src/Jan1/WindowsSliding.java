package Jan1;

import java.util.ArrayDeque;
import java.util.Deque;

public class WindowsSliding {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int counter = 0;
         int[] result = new int[nums.length -k + 1];
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for(int i = 0 ; i < nums.length ; i ++){
            while (!stack.isEmpty() && stack.peek() == i - k){
                stack.poll(); // poll remove the last element in the array.
            }
            while ( !stack.isEmpty() && nums[stack.peekLast()] <= nums[i] ){
                stack.pollLast(); // pollLst remove the first element of the array
            }
            stack.offer(i); // add the element the last
            if ( i >= k - 1){
                result[counter] = nums[stack.peek()]; // peek get the element at the last
                counter++;
            }
            
        }
        return result;
        
    }
    // Time : O(N + N)
    // Space : O(N)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
