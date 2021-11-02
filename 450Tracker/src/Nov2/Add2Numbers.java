package Nov2;

//https://leetcode.com/problems/add-two-numbers
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Add2Numbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode();
        ListNode current = result;
        int remainder = 0;
        while (l1 != null || l2 != null){
            int currentvalue =  remainder;
            if (l1 != null){
                currentvalue += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                currentvalue += l2.val;
                l2 = l2.next;
            }
            int quot = currentvalue % 10;
            
            ListNode newnode = new ListNode(quot );
            if (remainder > 0){
                remainder = 0;
            }
            remainder = currentvalue / 10;
            current.next = newnode;
            current = current.next;
        }
        if (remainder > 0){
            ListNode newnode = new ListNode(remainder);
            current.next = newnode;
            current = current.next;
        }
        return result.next;
        
        
        
        
    }// Time : O(max(m,n))
	// Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
