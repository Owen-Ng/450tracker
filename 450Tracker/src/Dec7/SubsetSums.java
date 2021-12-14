package Dec7;

import java.util.ArrayList;
//https://practice.geeksforgeeks.org/problems/subset-sums2234/1
public class SubsetSums {
	public ArrayList<Integer> result = new ArrayList<Integer>();
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        recursion(arr, 0, 0);
        return result;
        
    }
    void recursion(ArrayList<Integer> arr, int pointer, int sum){
        if (pointer > arr.size() - 1){
            result.add(sum);
        }
        else{
            recursion(arr, pointer + 1, sum + arr.get(pointer));
            recursion(arr, pointer + 1, sum);
        }
    }
}
//Time : O(2**n)
// Space: O(2**n)
