package Oct17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountSmallerNumbers {
	
	
//	public List<Integer> countSmaller(int[] nums) {
//		//This solution only satisfied 49/65 apparently it is reading more than it 
//		// should I think the cause is because it is reading where
//		// given index i > j, index i is being compare to those below js
//		
//		// Note: Realization Since I am using HashMap I am overlapping with potential
//		// duplicate numbers this is a probable cause
//        // List<Integer> arr = new ArrayList<Integer>();
//        int [] oldnums = new int[nums.length];
//        for (int i = 0 ; i < nums.length; i ++){
//            oldnums[i] = nums[i];
//        }
//        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; i ++){
//            hm.put(nums[i], 0);
//        }
//        merge(nums, 0, nums.length - 1, hm);
//        // System.out.println(hm.toString());
//        
//        List<Integer> result = new ArrayList<Integer>();
//        // System.out.println(Arrays.toString(nums));
//        for (int i : oldnums){
//            result.add(hm.get(i));
//        }
//        return result;
//    }
//    public void merge(int[] nums, int l,int r,  HashMap<Integer, Integer> hm){
//        if (l < r){
//        	// Here needed some help from mergesort solution previously 
//        	// I had one extra size which causes to break
//        	// Previous I had merge(nums, 0, nums.length, hm); and
//        	// not merge(nums, 0, nums.length - 1, hm);
//            int m = (l + r)/2;
//            merge(nums, l, m, hm);
//            merge(nums, m + 1, r, hm);
//            mergesort(nums, l, m , r, hm);
//        }
//    }
//    
//    public void mergesort(int[] nums, int l,int mid,  int r ,  HashMap<Integer, Integer> hm)    {
//        // System.out.println(Arrays.toString(nums));
//        int j = mid + 1;
//        
//        for (int i = l; i <= mid ; i ++){
//            while (j <= r && nums[i] > nums[j]){
//                j++;
//            }
//            // System.out.println(nums[i]);
//            hm.put(nums[i], hm.get(nums[i]) + (j - (mid + 1)));
//        }
//        
//        List<Integer> tmp = new ArrayList<Integer>();
//        
//        int lpointer = l;
//        int endpointer = mid + 1;
//        while (lpointer <= mid && endpointer <= r){
//            if (nums[lpointer]< nums[endpointer]){
//                tmp.add(nums[lpointer]);
//                lpointer++;
//            }else{
//                tmp.add(nums[endpointer]);
//                endpointer ++;
//            }
//        }
//        
//        while (lpointer <= mid){
//            tmp.add(nums[lpointer]);
//            lpointer++;
//        }
//        while(endpointer <= r){
//            tmp.add(nums[endpointer]);
//            endpointer++;
//        }
//        // System.out.println(tmp.toString());
//
//        for (int i = 0; i < tmp.size(); i ++){
//            nums[l + i] = tmp.get(i);
//        }
//        // System.out.println(Arrays.toString(nums));
//
//    }
    
    // Valid solution 
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        int [] indices = new int[nums.length];
        for (int i = 0 ; i < nums.length; i ++){
            result.add(0);
            arr.add(0);
            indices[i] = i;
        }
       
        merge(nums, 0, nums.length - 1, arr, indices);
    
        for (int i = 0; i < indices.length; i ++){
            result.set(indices[i], arr.get(i));
        }
        
        
        return result;
    }
    public void merge(int[] nums, int l,int r,  List<Integer> arr, int[] indices){
        if (l < r){
            int m = (l + r)/2;
            merge(nums, l, m, arr, indices);
            merge(nums, m + 1, r, arr , indices);
            mergesort(nums, l, m , r, arr , indices);
        }
    }
    
    public void mergesort(int[] nums, int l,int mid,  int r ,List<Integer>  arr, int[] indices)    {
        // System.out.println(Arrays.toString(nums));
        int j = mid + 1;
        
        for (int i = l; i <= mid ; i ++){
            while (j <= r && nums[i] > nums[j]){
                j++;
            }
            // System.out.println(nums[i]);
            arr.set(i, arr.get(i) + (j - (mid + 1)));
            // hm.put(nums[i], hm.get(nums[i]) + (j - (mid + 1)));
        }
        List<Integer> arrtmp = new ArrayList<Integer>();
        List<Integer> indicestmp = new ArrayList<Integer>();
//         for (int i = 0; i < l; i ++ ){
//             arrtmp.add(arr.get(i));
//         }// treating the external left side
        
        List<Integer> tmp = new ArrayList<Integer>();
        
        int lpointer = l;
        int endpointer = mid + 1;
        while (lpointer <= mid && endpointer <= r){
            if (nums[lpointer]< nums[endpointer]){
                tmp.add(nums[lpointer]);
                arrtmp.add(arr.get(lpointer));
                indicestmp.add(indices[lpointer]);
                lpointer++;
            }else{
                tmp.add(nums[endpointer]);
                arrtmp.add(arr.get(endpointer));
                indicestmp.add(indices[endpointer]);

                endpointer ++;
            }
        }
        
        while (lpointer <= mid){
            tmp.add(nums[lpointer]);
            arrtmp.add(arr.get(lpointer));
            indicestmp.add(indices[lpointer]);

            lpointer++;
        }
        while(endpointer <= r){
            tmp.add(nums[endpointer]);
            arrtmp.add(arr.get(endpointer));
            indicestmp.add(indices[endpointer]);


            endpointer++;
        }
        // System.out.println(tmp.toString());

        for (int i = 0; i < tmp.size(); i ++){
            nums[l + i] = tmp.get(i);
            arr.set(l+i, arrtmp.get(i));
            indices[l+i] = indicestmp.get(i);
        }
        // System.out.println(Arrays.toString(nums));

    }
    // Note: ArrayList set and get are all constant time
    // SO Time: O(NlogN)
    // Space: O(N)
    // FOr this solution I stored the indices which will change accordingly to 
    // the mergesort algo
    // My explanation on leetcode
    //https://leetcode.com/problems/count-of-smaller-numbers-after-self/discuss/1526966/JAVA-MergeSort-O(NLogN)-runtime-O(N)-space-With-Explanation
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
