package Nov7;

public class ReverseKLinkedlist {
	public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode cur = dummy;
        ListNode pre = dummy;
        ListNode n = dummy;
        int count = 0;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        
        while(count > k){
            cur = pre.next;
            n = cur.next;
            for (int i = 1; i < k; i++){
                cur.next = n.next;
                n.next = pre.next;
                pre.next = n;
                n = cur.next;
            }
            pre = cur;
            count -= k;
        }
        return dummy.next;
        
    }
	// Time: O(N) ( O(N/k) * K)
	// Space : O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
