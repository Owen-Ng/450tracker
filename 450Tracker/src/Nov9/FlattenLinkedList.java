package Nov9;
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
public class FlattenLinkedList {
	Node flatten(Node root)
    {
	// Your code here
	    if (root == null || root.next == null){
	        return root;
	    }
	    root.next = flatten(root.next); // This will go towards the very end of the next node\
	    
	    root = merge(root, root.next);
	    
	    return root;
    }
    Node merge(Node a, Node b){
        
        Node dummy = new Node(0);
        Node res = dummy;
        
        while (a != null && b != null){
            if (a.data > b.data){
                dummy.bottom = b ;
                dummy = dummy.bottom;
                b = b.bottom;
            }else{
                dummy.bottom = a ;
                dummy = dummy.bottom;
                a = a.bottom;
            }
        }
        if (a != null){
            dummy.bottom = a;
        }else{
            dummy.bottom = b;
        }
        return res.bottom;
    }
//    Time: O(the amount of node);
//    Space: O(1)
//    Intuition:
//    	Start merging the linkedlist at the very end
//    	and progrssively going to the left side
//    	then continuously merging until finished
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
