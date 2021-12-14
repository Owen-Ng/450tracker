package Nov7;

public class LinkedListCycle {
	public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow  = head;
        
        do{
            if (fast == null || fast.next == null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }while (fast != slow);
        ListNode start = head;
        while(start != slow){
            start = start.next;
            slow = slow.next;
        }
        return slow;
    }
	// Time : O(N)
	// Space : O(1)
	
	// Intuition:
//	
//	Assume L1 is the line where they are not in the cycle
//	L2 is the line that are in the cycle
//	S = L1 + L2
//	F = L1 + L2 + cycles
//	
//	We know F go twice as fast as slow. SO the distance covered must be
//	2(S) = F
//	2(L1 + L2) = L1 + L2 + cycles
//	L1 + L2 = cycles
//	L1 = cycles - L2
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
