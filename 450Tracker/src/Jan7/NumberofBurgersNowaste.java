package Jan7;

import java.util.ArrayList;
import java.util.List;

public class NumberofBurgersNowaste {
	public static List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        // 1 big and 6 small
        //b | ssssss
        // if mid is greater then we need to move left else right
        //
        List<Integer> result = new ArrayList<Integer>();
        if (cheeseSlices == 0 && tomatoSlices == 0 ){
            result.add(0);
            result.add(0);
            return result;
        }
        if (cheeseSlices == 0  || tomatoSlices == 0 || cheeseSlices * 4 < tomatoSlices || tomatoSlices < cheeseSlices ){
            return result;
        }
        
         
        int numofBurgers = cheeseSlices;
        int l = 0;
        int r= numofBurgers;
        
        while(l <= r){
            int mid = (l + r)/2;
            int current = (mid * 4) + (cheeseSlices -  mid) * 2;
            
            if (current == tomatoSlices){
                result.add(mid);
                result.add(cheeseSlices - mid);
                return result;
            }
            
            if (current > tomatoSlices){
                r = mid ;
            }else{
                l = mid  ;
            }
            
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(  1653165 % 4);
	}
}
