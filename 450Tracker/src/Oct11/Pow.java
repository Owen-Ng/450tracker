package Oct11;

public class Pow {
	public double myPow(double x, int nn) {
        // if n % 2 == 0, need to n = n/2 and x * x
        // if n % 2 == 1, need to n = n -1 and result =  result * x
        // if (n == 0){
        //     return 1;
        // }
        double n = nn;
        boolean ng = false;
        if (n < 0){
            ng = true;
            n = n * -1;
        }
     
        double result = 1;
        while (n > 0){
            if ( n % 2 == 0){
                x = x*x;
                n = n/2;
            }else{
                result = result * x;
                n = n - 1;
            }
        }
        if (ng){
            return 1/result;
        }
        return result;
    }
	//TIme: O(logn) because for each iteration the iteration process is divided approximately by 2
	// Time: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
