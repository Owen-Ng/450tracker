package Dec8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;


public class CombinationSum2 {
	public HashSet<List<Integer>> result = new HashSet<List<Integer>>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        recursion(candidates, 0, target, new ArrayList<Integer>());
        Iterator<List<Integer>> iresult = result.iterator();
        List<List<Integer>> Lresult = new ArrayList<List<Integer>>();
        while (iresult.hasNext()){
            Lresult.add(iresult.next());
        }
        return Lresult;
    }
    public void recursion(int[] candidates, int pointer, int target, List<Integer> current){
        if (target == 0){
            result.add(new ArrayList(current));
            
        }else if ( target > 0 && pointer < candidates.length){
            current.add(candidates[pointer]);
            recursion(candidates, pointer + 1, target - candidates[pointer], current);
            current.remove(current.size() - 1);
            recursion(candidates, pointer + 1, target, current);
        }
    } // Time O(2**n) O(Klog n)
    // Space O(N * T)
    
    public List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        recursion(candidates, 0, target, new ArrayList<Integer>());
        
        return result;
    }
    public void recursion(int[] candidates, int pointer, int target, List<Integer> current){
        if (target == 0){
            result.add(new ArrayList(current));
            
        }else if ( target > 0 && pointer < candidates.length){
            
            for (int i = pointer; i < candidates.length; i++)
            {
                if (i != pointer && i < candidates.length && candidates[i] == candidates[i - 1]){
                    continue;
                }
                current.add(candidates[i]);
                recursion(candidates, i + 1, target - candidates[i], current);
                current.remove(current.size() - 1);
                // recursion(candidates, pointer + 1, target, current);
            }
            
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
