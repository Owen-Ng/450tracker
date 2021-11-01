package Oct31;
//https://leetcode.com/problems/merge-two-sorted-lists/submissions/
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class Merge2sortedLinkedlist {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        ListNode current = l1;
        ListNode current2 = l2;
        ListNode currentpos = new ListNode(0, current);
        while(current != null){
            currentpos = currentpos.next;
            ListNode tmp = current.next;
            if (current2.val < current.val){
                int tmpval = current.val;
                current.val = current2.val;
                current2.val = tmpval;
                
                ListNode pointer1 = current2;
                ListNode pointer2 = current2.next;
                
                while(pointer2 != null && pointer2.val < pointer1.val){
                    int tmppointer = pointer2.val;
                    pointer2.val = pointer1.val;
                    pointer1.val = tmppointer;
                    pointer2 = pointer2.next;
                    pointer1 = pointer1.next;
                }
                
                
                
                
            }
            current = tmp;
        }
        
        currentpos.next = current2;
        return l1;
    }// Time: O(Nlogm) + O(m) ~ O(nLogm)
	//Space: O(n + m)
	
	public ListNode OmergeTwoLists(ListNode l1, ListNode l2) {
		//Optimized
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        if (l1.val > l2.val){
            ListNode tmp = l2;
            l2 = l1;
            l1 = tmp;
        }
        ListNode res = l1;
        while (l1 != null && l2 != null){
            ListNode tmp = null;
            while (l1 != null && l1.val <= l2.val){
                tmp = l1;
                l1 = l1.next;
            }
            tmp.next = l2;
            
            ListNode tmpswap = l2;
            l2 = l1;
            l1 = tmpswap;
        }
        
        return res;
        
    }
	//TIme : O(N)
	//Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
