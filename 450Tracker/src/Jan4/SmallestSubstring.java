package Jan4;

import java.util.HashMap;

public class SmallestSubstring {

	static String getShortestUniqueSubstring(char[] arr, String str) {
	    
	    String current = "";
	    String answer =str;
	    HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	    char[] cstr = str.toCharArray();
	    for (char c : arr){
	      hm.put(c, 0);
	    }
	    int count = Integer.MAX_VALUE;
	    for (char c : cstr){
	      current += c;
	      hm.put(c, hm.get(c) + 1); 
	      
	      if (check(hm, arr) && current.length() >= arr.length && current.length() <= answer.length() ){
	        System.out.println(current);
	        answer = current;
	        current = removeDuplicate(hm, current);
	        
	      }
	      
	    }
	    while (current.length() > 0){
//	        System.out.println(current);

	      current = removeDuplicate(hm, current);
	      if (check(hm, arr) && current.length() >= arr.length && current.length() <= answer.length() ){
	        answer = current;
	      }
	    }
	    return answer;
	    // Time : O( N * k) k is the length of arr and N is length of string
	  }
	  public static boolean check(HashMap<Character, Integer> hm, char [] arr){
	    for (char i : arr){
	      if (hm.get(i) == 0){
	        return false;
	      }
	    }
	    return true;
	  }
	  public static String removeDuplicate(HashMap<Character, Integer> hm, String current){
	    int index = 0;
	    while ( index + 1 < current.length() && current.charAt(index) == current.charAt(index + 1)){
	      index++;
	    }
//	    System.out.println(hm);
//	    System.out.println(current.charAt(index));
//	    System.out.println(current );

	    hm.put(current.charAt(index), hm.get(current.charAt(index)) - index - 1);
	    return current.substring( index + 1, current.length());
	    
	  }

	  public static void main(String[] args) {
	    char[] tmp = {'x','y','z'};
	      System.out.println(getShortestUniqueSubstring(tmp, "xyyzyzyx"));
	  }

	}