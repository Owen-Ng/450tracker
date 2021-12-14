package Dec7;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        recursion(candidates, target, 0, result, new ArrayList<Integer>());
        return result;
        
    }
    public void recursion(int[] candidates, int target, int pointer,List<List<Integer>>  result,List<Integer> current){
        if (target == 0){
            result.add(new ArrayList(current));
        }else if (target > 0 && pointer < candidates.length){
            current.add(candidates[pointer]);
            recursion(candidates, target - candidates[pointer], pointer, result, current);
            current.remove(current.size() - 1);
            recursion(candidates, target, pointer + 1, result, current);
        }
    }
    //Time O(2**N * N) it is less than this because we are considering deep copy a N
    // Space O(t * N) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
