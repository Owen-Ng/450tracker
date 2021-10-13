package Oct11;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
	public List<Integer> majorityElement(int[] nums) {
        int e1 = 0;
        int e2 = 0;
        int c1 = 0;
        int c2 = 0;
        
        for (int i : nums){
            if (e1 == i){
                c1 ++;
            }
            else if (e2 == i){
                c2 ++;
            }
            else if (c1 == 0){
                e1 = i;
                c1 = 1;
            }else if (c2 == 0){
                e2 = i;
                c2 = 1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for (int i : nums){
            if ( i == e1){
                c1 ++;
            }
            else if ( i == e2){
                c2 ++;
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        if (c1 > nums.length/3){
            result.add(e1);
        }
        if (c2 > nums.length/3){
            result.add(e2);
        }
        return result;
    }
	//Time: O(N)
	// Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
