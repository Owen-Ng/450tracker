package Nov19;

import java.util.Arrays;

public class JobSequence {
	int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr, (a,b) -> b.profit - a.profit);
        int maxi = 0;
        for(Job i : arr){
            if (i.deadline > maxi){
                maxi = i.deadline;
            }
            
        }
        int[] jobs = new int[maxi + 1];

        for(int i = 0 ; i < maxi + 1 ; i ++){
            jobs[i] = -1;
        }
        int total = 0;
        int l = 0;
        for (int i = 0 ; i < n; i ++){
            if (jobs[arr[i].deadline] == -1){
                jobs[arr[i].deadline] = arr[i].id;
                l++;
                total += arr[i].profit;
            }else{
                int j = arr[i].deadline - 1;
                
                while (j >= 1 && jobs[j] != -1){
                    j--;
                }
                if (j >= 1){
                    jobs[j] = arr[i].id;
                    total += arr[i].profit;
                    l ++;
                }
                
            }
        }
        int[] res = {l, total};
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
