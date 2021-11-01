package Oct31;

public class removenthNodeLinkedlist {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode start = dummy;
        ListNode end = dummy;
        
        for (int i = 0; i < n; i++){
            end = end.next;
        }
            
        while (end.next != null){
            end = end.next;
            start = start.next;
        }
        
        start.next = start.next.next;
        
        return dummy.next;
    }
	//Time: 0(N)
	
	//Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
