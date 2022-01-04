package Dec31;

import java.util.Stack;

public class LargestRectangle {
	public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] leftleast = new int[heights.length];
        for (int i = 0 ; i < heights.length ; i ++){
           
                while (!stack.empty() && heights[stack.peek()] >= heights[i]){
                    stack.pop();
                }
                if (stack.empty()){
                    leftleast[i] = 0;
                     
                }else{
                    
                    
                    leftleast[i] = stack.peek() + 1;
                }
            stack.push(i);
            
        }
        stack = new Stack<Integer>();
        int[] rightleast = new int[heights.length];
        for ( int i = heights.length -1; i >= 0; i --){
           
                while (!stack.empty() && heights[stack.peek()] > heights[i]){
                    stack.pop();
                }
                if (stack.empty()){
                    rightleast[i] = heights.length - 1;
                    
                }else{
                     
                    rightleast[i] = stack.peek() - 1;
                }
            stack.push(i);
            
        }
           

        int max = 0;
        for (int i = 0; i < heights.length; i ++){
            int current = ((Math.abs(rightleast[i] - leftleast[i]) + 1) * heights[i]);
            if (current > max){
                max = current;
            }
        }
        return max;
    }// Time : O(N) * 2 because ina stack we are not removing all the element 
	// all the time
	// SPace: O(N) * 3
	// Intuition we need to keep the smaller element relative to the current position from left and right
	// Then this will keep track from the given position what is the furthest left and right it can go
	// for each index recorded, we need to abs(left - right) * height
	
	 public int oplargestRectangleArea(int[] heights) {
	        if (heights.length == 1){
	            return heights[0];
	        }
	        Stack<Integer> stack = new Stack<Integer>(); 
	        int max = 0;
	        for (int i = 0 ; i <= heights.length ; i ++){ 
	                while (!stack.empty() && (i == heights.length|| heights[stack.peek()] >= heights[i])){
	                    int tmp = heights[stack.pop()];
	                    int currentsum = 0; 
	                    if (stack.empty()){
	                         currentsum = i * tmp;
	                    }else{
	                        currentsum = (Math.abs(stack.peek() - i) - 1) * tmp;
	                    }
	                    if (currentsum > max){
	                        max = currentsum;
	                    }
	                }
	                stack.push(i); 
	        } 
	        return max; 
	    } 
	 // Time O(N)
	 // SPace: O(N)
	 // Intuition we after every position we will be at the max corner for certain height.
	 // When popping the element we shall take the current position at the extreme right limit and take the position that is greater or
	 // equal to the current height this will give us the area of the rectangle.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
