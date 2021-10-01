package Sept30;

import java.util.Arrays;

public class MergeSortedArray {
	public static  void  merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0 ){
            return;
        }
        for (int i = 0; i < m; i++){
            int cur = nums1[i];
            if (cur > nums2[0]){
                nums1[i] = nums2[0];
                nums2[0] = cur;
                int pos = 0;
                while(pos < nums2.length - 1 && nums2[pos] > nums2[pos + 1]){
                    int tmp = nums2[pos];
                    nums2[pos] = nums2[pos + 1];
                    nums2[pos + 1] = tmp;
                    pos++;
                }
            }
                
        }
        int index = 0;
        for (int i = m; i < nums1.length; i ++){
                nums1[i] = nums2[index];
                index ++;
        }
        //Time Compplexity: O(n * m)
        // Space : O(1)
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {-1,0,0,3,3,3,0,0,0};
		int [] nums2 = {1,2,3};
		merge(nums1, 6, nums2 , 3);
		System.out.print(Arrays.toString(nums1));
		

	}

}
