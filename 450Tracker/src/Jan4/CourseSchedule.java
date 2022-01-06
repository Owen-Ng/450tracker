package Jan4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CourseSchedule {
	 public boolean canFinish(int numCourses, int[][] prerequisites) {
	        HashMap <Integer, List<Integer>> hm = new HashMap<Integer, List<Integer>>();
	        for(int[] i : prerequisites){
	            if (hm.get(i[0]) == null){
	                List<Integer> tmp =  new ArrayList<Integer>();
	                tmp.add(i[1]);
	                hm.put(i[0], tmp);
	            }else{
	                List<Integer> tmp =  hm.get(i[0]);
	                tmp.add(i[1]); 
	            }
	            
	        }
	        boolean[] vis  = new boolean[numCourses];
	        
	        // if a course does not exist in hm this means no requirement for this course
	        for (int i = 0; i < numCourses; i ++){
	            if (isCycle(i, vis, hm) == false){
	                return false;
	            }
	                
	        }
	        return true;
	        }
	 // Time O(n + E)
	 // Space O (n + e)
	    public boolean isCycle(int current, boolean[] vis , HashMap <Integer, List<Integer>> hm ){
	        if (vis[current] == true){
	            return false;
	        }
	        if (hm.get(current) == null){
	            return true;
	        }
	        vis[current] = true;
	        for (Integer e : hm.get(current)){
	              if (isCycle(e, vis, hm) == false){
	                return false;
	            }
	        }
	        vis[current] = false;
	        hm.put(current, null);
	        return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
