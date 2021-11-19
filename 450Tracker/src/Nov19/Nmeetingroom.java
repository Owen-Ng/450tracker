package Nov19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static void insertionsort(List<List<Integer>> arr){
        for (int i = 1; i < arr.size(); i++){
            int j = i - 1;
            int ii = i;
            while(j >= 0 && arr.get(ii).get(1) < arr.get(j).get(1)){
                List<Integer> tmp = arr.get(ii);
                arr.set(ii, arr.get(j));
                arr.set(j, tmp);
                j --;
                ii --;
            }
        }
    }
    public static int maxMeetings(int start[], int end[], int n)
    {
        if (start.length == 0 || end.length == 0){
            return 0;
        }
        List<List<Integer>> stack = new ArrayList<List<Integer>>();
       for (int i = 0; i < n ; i ++){
           List<Integer> tmp = new ArrayList<Integer> (Arrays.asList(start[i], end[i], i));
           stack.add(tmp);
       }
       insertionsort(stack);
       System.out.println(stack.toString());
       int res = 1;
       int limit = stack.get(0).get(1);
       for(int i = 1 ; i < n; i ++){
    	   System.out.println(limit);
           if (stack.get(i).get(0) >limit){
               limit = stack.get(i).get(1);
               res++;
           }
       }
       return res;
        // add your code here
    }
}

public class Nmeetingroom {
	//https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbW8yYmtxY3haX3ZPMnpzWEQ3RER1X0lmOF9Id3xBQ3Jtc0tsaEh1UmNNUnBUdVh3TEJGa2o2RUctQmx5d2szUlJUUE42OUFybXFHODdaRUllYVplN2liQmNQZktzZHlhQUhlekVOZU53WTlaNS1yMzZLcW9QTlVOcmpLUUtqVERGekx2RTJrSmlScmhnMWJQbzdlUQ&q=https%3A%2F%2Fpractice.geeksforgeeks.org%2Fproblems%2Fn-meetings-in-one-room-1587115620%2F1
	public static void insertionsort(List<List<Integer>> arr){
        for (int i = 1; i < arr.size(); i++){
            List<Integer> key = arr.get(i);
            int j = i - 1;
            while(j >= 0 && key.get(1) < arr.get(j).get(1)){
                arr.set(j+ 1, arr.get(j));
                j --;
            }
            arr.set(j+1, key);
        }
    }
	
    public static int maxMeetings(int start[], int end[], int n)
    {
        if (start.length == 0 || end.length == 0){
            return 0;
        }
        List<List<Integer>> stack = new ArrayList<List<Integer>>();
       for (int i = 0; i < n ; i ++){
           List<Integer> tmp = new ArrayList<Integer> (Arrays.asList(start[i], end[i], i));
           stack.add(tmp);
       }
       insertionsort(stack);
       int res = 1;
       int limit = stack.get(0).get(1);
       for(int i = 1 ; i < n; i ++){
           if (stack.get(i).get(0) >limit){
               limit = stack.get(i).get(1);
               res++;
           }
       }
       return res;
        // add your code here
    }
    // Takes too long to run.
    // Time: O(NlogN)
    // Space: O(N) Well this should technically work.
    public static int SuccessmaxMeetings(int start[], int end[], int n)
    { 
        int count=0,lend=0;
       int [][] fill=new int [n][2];
       for(int i=0;i<n;i++){
           fill[i][0]=start[i];
           fill[i][1]=end[i];
       }
       Arrays.sort(fill,(a,b)->Double.compare(a[1],b[1]));
       for(int i=0;i<start.length;i++){
           if(fill[i][0]>lend){
               lend=fill[i][1];
               count++;
           }
       }
       return count;
    }
 // Time: O(NlogN)
    // Space: O(N) Well this should technically work. This one work. The reason for this to work
    // is they are using array instead of arraylist which is faster. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Solution t = new Solution();
		int N = 8;
		int start[] = {
				75250, 50074, 43659, 8931, 11273 ,27545, 50879 ,77924};
				
		int end[] =  {112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252};
		int res = Solution.maxMeetings(start, end, N);
		System.out.println(res);
	}

}
