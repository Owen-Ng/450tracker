package Dec28;

import java.util.Stack;

public class BalancedParentheses {
	   public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<Character>();
	        for(char c: s.toCharArray()){
	            if ( stack.empty()){
	                stack.push(c);
	            }else if (c == ')' && stack.peek() == '('){
	                stack.pop();
	            }else if (c == '}' && stack.peek() == '{'){
	                stack.pop();
	            }else if ( c == ']' && stack.peek() == '['){
	                stack.pop();
	            }else{
	                stack.push(c);
	            }
	        }
	        return stack.empty();
	    }
	   // Time : O(N)
	   // Space : O(N)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
