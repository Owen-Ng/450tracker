package Dec28;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
	 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	        for (int i  = 0; i < nums2.length; i ++){
	            hm.put(nums2[i],i);
	        }
	        
	        for (int i = 0; i < nums1.length; i ++){
	            int j = hm.get(nums1[i]);
	            int pointer = j + 1;         
	            while (pointer < nums2.length){
	                if (nums1[i] < nums2[pointer]){
	                    nums1[i] = nums2[pointer];
	                    break;
	                }
	                pointer++;
	            }
	            if ( nums1[i] == nums2[j]){
	                nums1[i] = -1;
	            }
	        }
	        return nums1;
	    }
	 public int[] StacknextGreaterElement(int[] nums1, int[] nums2) {
	        Stack<Integer> stack = new Stack<Integer>();
	        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	        for (int i : nums1){
	            hm.put(i, -1);
	        }
	        for (int i = nums2.length - 1; i >= 0; i --){
	            int tmp = nums2[i];
	            if (stack.empty()){
	                stack.push(nums2[i]);
	                nums2[i] = -1;
	            }else{
	                while(!stack.empty() && stack.peek() <= nums2[i]){
	                    stack.pop();
	                }
	                if (stack.empty()){
	                    nums2[i] = -1;
	                }else if (stack.peek() > nums2[i]){
	                    nums2[i] = stack.peek();
	                }
	                stack.push(tmp);
	                
	            }
	            if (hm.get(tmp) != null){
	                hm.put(tmp, nums2[i]);
	            }
	        }
	        for (int i= 0 ; i < nums1.length; i ++){
	            nums1[i] = hm.get(nums1[i]);
	        }
	        return nums1;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
