package Sept30;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
	public int[][] merge(int[][] intervals) {
        ArrayList<int[]> result = new ArrayList<int[]>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] current = intervals[0];
        for(int i =0; i < intervals.length; i ++){
            if (current[1] >= intervals[i][1]){
                continue;
            }else if (current[1] >= intervals[i][0]){
                System.out.println(1);
                current[1] = intervals[i][1];
            }else{
                result.add(current);
                current = intervals[i];
            }
        }
        result.add(current);
        int[][] ans = new int[result.size()][2];
        for ( int i = 0; i < result.size(); i ++){
            ans[i] = result.get(i);
        }
        return ans;
        //Time Complexity: O(n) + O(n) + O(nlogn) = O(nlogn)
        // Space complexity is: O(n)
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
