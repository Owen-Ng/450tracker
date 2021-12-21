package Dec20;

import java.util.List;

public class WordBreak {
	 public boolean recursion(String s, List<String> wordDict, String current, int maxl){
         if (maxl < current.length()){
             return false;
         } 
        for (int i = 0; i <  s.length(); i++ ){
            current += s.charAt(i);
            if(wordDict.contains(current)){
                if (recursion(s.substring(i+1, s.length()), wordDict,current, maxl)){
                    return true;
                }
                current ="";
            }
        
        }
        if (wordDict.contains(current)){
                current = "";
            }
        if (current.length() > 0){
            return false;
        }else{
            return true;
        }
    }//Time: O(2**N)
	 //space: O(N)
    public boolean wordBreak(String s, List<String> wordDict) {
        int maxl = 0;
        for (String i : wordDict){
          if (i.length() > maxl){
              maxl = i.length();
          }  
        }
        return recursion(s, wordDict, "", maxl);
    }
    public boolean opwordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
         for (int i =0; i < s.length(); i ++){
             dp[0] = false;
         }
         dp[s.length()] = true;
         for (int i = s.length() -1 ; i >= 0; i --){
             for (String ss : wordDict){
                 if (i + ss.length() <= s.length() && s.substring(i,i +  ss.length()).equals(ss)){
                     dp[i] = dp[i + ss.length()];
                 }
                 if (dp[i]){
                     break;
                 }
             }
         }
         return dp[0];
     }// Time : O(N * M)
    // space: O (N)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
