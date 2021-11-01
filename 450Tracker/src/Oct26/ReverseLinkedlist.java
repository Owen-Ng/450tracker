package Oct26;
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReverseLinkedlist {
	 public ListNode reverseList(ListNode head) {
	        ListNode dummy = null;
	        
	        while (head != null){
	            ListNode tmp = head.next;
	            head.next = dummy;
	            dummy = head;
	            head = tmp;
	        }
	        
	        return dummy;
	    }
	 //Time: O(N)
	 //Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
