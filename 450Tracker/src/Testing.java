
public class Testing {
	void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int j = i - 1;
            int ii = i;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > arr[ii]) {
                int tmp = arr[j];
                arr[j] = arr[ii];
                arr[ii] = tmp;
            	ii--;
            	j--;
            }
        }
    }
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { -11 ,12,12, 11, 13, 5, 6, 1, 5,4,3,2,0, };
		 
	        Testing ob = new Testing();
	        ob.sort(arr);
	 
	        printArray(arr);
	}

}
