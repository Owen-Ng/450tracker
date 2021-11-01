package Oct31;
//https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/
public class deletenodelinkedlist {
	public void deleteNode(ListNode node) {
	        
	        while (node.next.next != null){
	            node.val = node.next.val;
	            node = node.next;
	        }
	        node.val = node.next.val;
	        node.next =null;
	    }
	//Time O(N)
	// space: O(1)
	public void OdeleteNode(ListNode node) {
	    
	    node.val = node.next.val;
	    node.next = node.next.next;
	}//Time O(1)
	//space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
