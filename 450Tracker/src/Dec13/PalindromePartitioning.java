package Dec13;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
	public List<List<String>> result = new ArrayList<List<String>>();
    public List<List<String>> partition(String s) {
        StringBuilder sb = new StringBuilder(s);
        recursion(sb, 0, new StringBuilder(), new ArrayList<String>());
        return result;
    }
    public void recursion(StringBuilder s,int position,StringBuilder current, List<String> currentlist){
        
        if (position < s.length()){
            current.append(s.charAt(position));
            if (is_Palindrome(current)){
                currentlist.add(new String(current));
                recursion(s, position + 1, new StringBuilder(), currentlist);
                currentlist.remove(currentlist.size() - 1);
            }
            recursion(s, position + 1, current, currentlist);
        }
        else if (position == s.length() && current.length() == 0){
            // System.out.println(current);
            // System.out.println(currentlist);
            result.add(new ArrayList(currentlist));
            // return;
            // currentlist.clear();
        }
    }
    public boolean is_Palindrome(StringBuilder s){
        int start = 0;
        int end = s.length() - 1;
        if (s.length() == 1){
            return true;
        }
        while (start < end){
            if (! (s.charAt(start)==s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }// Time: O(2**N ) * O(N) . O(N) for checking palindrome
    // SPace: O(2**N ) * O(N) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
