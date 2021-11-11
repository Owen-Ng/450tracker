package Nov10;
  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class RotateLinkedList {
	public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null){
            return head;
        }
        int count = 1;
        ListNode dummy = head;
        while (dummy.next != null){
            count ++;
            dummy = dummy.next;
        }
        dummy.next = head;
        
         count = count -  (k % count);
        
        for (int i = 1; i < count ; i ++){
            head = head.next;
        }
        ListNode tmp = head.next;
        head.next = null;
        
        return tmp;
    }
	// Time: O(N)
	// Space: O(1)
	// Intuition get the length of the linkedlist and then connect the end with start then find the connection that need to be broken.
	// Then break it return the result.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
