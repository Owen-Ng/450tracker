package Dec24;

import java.util.ArrayList;

public class Kthpermutation {
	public String getPermutation(int n, int k) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int fact = 1;
        for (int i = 1; i < n; i ++){
            fact*= i;
            nums.add(i);
        }
        nums.add(n);
        String result = "";
        k--;
        while(true){
            // k/fact means the position of new modified array
            result += nums.get(k/fact);
            nums.remove(k/fact);
            if (nums.size() ==0){
                break;
            }
            k = k% fact; //means the extra position left to find the next element
            fact = fact/nums.size(); // indicating the size of each boxes 
        }
        return result;
    }// Time O(N**2)
	// Space O(N)
    // Intuition:
    // we are trying to find the right number for each index.
    // for each index, we need to find the position from the given
    // n!. given k / n- 1! = the current value
    // We need to remove the element that we chose
    // after this for the next iteration, we
    // need to find the new k and new factorial
    // to find the new k, k % n - 1 this will give out 
    // the positin of the next iteration from the new array
    // need new n. n = n/arr.size() this will mean how many element are
    // there in each box
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
