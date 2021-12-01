package Nov3;
//https://leetcode.com/problems/linked-list-cycle/submissions/
public class LinkedlistCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
        {
            return false;
        }
        ListNode t = head.next;
        ListNode r = head.next.next;
        
        while (t != r){
            if(t == null || r == null || t.next == null || r.next == null || r.next.next == null){
                return false;
            }
            t = t.next;
            r = r.next.next;
        }
        return true;
    }
    // Time : O(N) Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
