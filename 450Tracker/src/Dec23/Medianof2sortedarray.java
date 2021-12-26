package Dec23;

public class Medianof2sortedarray {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if (n1 > n2){
            return findMedianSortedArrays(nums2, nums1);
        }
        int low = 0;
        int high = n1;
        
        while(low <= high){
            int cut1 = (low + high)>> 1;
            int cut2 = (n1 + n2 + 1)/2 - cut1;
            
            int left1 = (cut1 == 0)? Integer.MIN_VALUE : nums1[cut1 - 1]; // from nums1
            int left2 = cut2 == 0? Integer.MIN_VALUE: nums2[cut2 - 1]; // from num2
            int right1 = cut1 == n1? Integer.MAX_VALUE: nums1[cut1];// from nums 1
            int right2 = cut2 == n2? Integer.MAX_VALUE: nums2[cut2]; // from nums2
            
            if (left1 <= right2 && left2 <= right1){
                if ((n1 + n2) % 2 == 0){
                    return (Math.max(left2, left1) + Math.min(right1,right2)) /2.0;
                }else{
                    return Math.max(left1,left2);
                }
            }else{
                if (left1 > right2){
                    high = cut1 -1;
                }else{
                    low = cut1 + 1;
                }
            }
        }
        return 0.0;
        
        
    } // Time: O(log n1 + n2)
	// Space: O(1)
	// Intuition we do binary search on the smallest array.
	// Then have 2 pointers that will cut both arrays.
	// if the left most is higher than the right most. It means out point is higher so we need to go down by cut -1
	// The most important part is to find the point where the left 2 pointers are less than their respective second array.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
