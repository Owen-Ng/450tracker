package Nov10;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class DuplicateLinkedlist {
	   public Node copyRandomList(Node head) {
	        HashMap<Node, Node> hm = new HashMap<Node, Node>();
	        Node dummy = head;
	        while (dummy != null){
	            Node copy = new Node(dummy.val);
	            hm.put(dummy, copy);
	            dummy = dummy.next;
	        }
	        Node result = new Node(0);
	        Node dummyresult = result;
	        while (head != null){
	            Node headcopy = hm.get(head);
	            Node randomcopy = hm.get(head.random);
	            headcopy.random = randomcopy;
	            result.next = headcopy;
	            result = result.next;
	            head = head.next;
	        }
	        return dummyresult.next;
	        
	    }
	   // Time: O(N)
	   // Space: (O(N)
   public Node OptimizedcopyRandomList(Node head) {
        Node dummy = head;
        
        while (dummy != null){
            Node copy = new Node(dummy.val);
            copy.next = dummy.next;
            dummy.next = copy;
            dummy = dummy.next.next;
        }
        
        Node dummy2 = head;
        
        while(dummy2 != null){
            // System.out.println(dummy2.val);
            if (dummy2.random == null){
                dummy2.next.random = dummy2.random;
            }else{
                dummy2.next.random = dummy2.random.next;
            }
            
            dummy2 = dummy2.next.next;
        }
        Node result = new Node(0);
        Node dummyresult = result;
        Node dummy3 = head;
        while (dummy3 != null){
            dummyresult.next = dummy3.next;
            dummyresult = dummyresult.next;
            dummy3.next = dummy3.next.next;
            dummy3 = dummy3.next ;
        }
        return result.next;
        
    }
   // Time: O(N)
   // Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
