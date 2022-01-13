package SomeUsefulStuff;

import java.util.ArrayList;

public class HeapSort {
	public void heapify(int largest, int size, ArrayList<Integer> arr) {
		int left= largest * 2 ; //like the left pf the root/largest in a tree
		int right = left + 1; //like the right pf the root/largest in a tree
		int oldlargest = largest;
		if (left < size && arr.get(left) > arr.get(largest)) {
			largest = left;
		}
		if (right < size && arr.get(right) > arr.get(largest)) {
			largest = right;
		}
		
		if (largest != oldlargest) {
			int tmp = arr.get(largest);
			arr.set(largest, arr.get(oldlargest));
			arr.set(oldlargest,  tmp );
  
			heapify(largest, size, arr);
		}
	}
	public ArrayList<Integer> Sort(ArrayList<Integer> arr){
		
		//rearrage the whole list so that it become a max heap
		
		for (int i = arr.size()/2 + 1 ; i >= 0; i --) {
			heapify(i, arr.size(), arr);
		}
		
		for (int i = arr.size() - 1; i > 0 ; i --) {
			int tmp = arr.get(0);
			arr.set(0, arr.get(i));
			arr.set(i, tmp);
			
			heapify(0, i - 1, arr);
		}
		return arr;
		
	}

}


//
//			1
//	    1        1
//	 1    1    1    1
// 1    1    1    1    1