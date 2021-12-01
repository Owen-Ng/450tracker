package Nov7;
 
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class LinkedlistPalindrome {
	 public boolean isPalindrome(ListNode head) {
	        ListNode middle = head;
	        ListNode fpointer = head;
	        
	        while(fpointer.next != null && fpointer.next.next != null){
	            middle = middle.next;
	            fpointer = fpointer.next.next;
	        }
	        ListNode dummymiddle = middle.next;
	        ListNode dummy = null;
	        
	        while(dummymiddle != null){
	            ListNode tmp = dummymiddle.next;
	            dummymiddle.next = dummy;
	            dummy =dummymiddle;
	            dummymiddle = tmp;
	        }
	        middle.next = dummy;
	        ListNode save = middle;
	        ListNode middle1 = middle.next;
	        ListNode head1 = head;
	        while(middle1 != null){
	            if(middle1.val != head1.val){
	                return false;
	            }
	            middle1 = middle1.next;
	            head1 = head1.next;
	        }
	        
	        // This one is unnecessary It just reverse back the linkedlist to normal
//	        ListNode dummy1 = null;
//	        ListNode dummymiddle1 = middle.next;
//	        while(dummymiddle1 != null){
//	            ListNode tmp = dummymiddle1.next;
//	            dummymiddle1.next = dummy1;
//	            dummy1 = dummymiddle1;
//	            dummymiddle1 = tmp;
//	        }
//	        middle.next = dummy1;
	        
//	        while(head != null){ // Not necessary to check the end result
//	            System.out.println(head.val);
//	            head = head.next;
//	        }
	        return true;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
