package Oct26;

public class MiddleofLinkedlistt {
	   public ListNode middleNode(ListNode head) {
	        ListNode t = head;
	        ListNode r = head;
	        
	        while ((r != null) && (r.next != null)){
	            r = r.next.next;
	            t = t.next;
	        }
	        return t;
	    }
	   // Time: O(n/2) ~ O(N)
	   //Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
