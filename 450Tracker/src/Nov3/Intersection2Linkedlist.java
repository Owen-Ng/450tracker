package Nov3;
//https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqblRqM0ZtOFRfTmREYzM5dUxIelRMaTI0ZHBvd3xBQ3Jtc0tuVDBqb190QjlvZkJCVDc4RkttWmM5czdqb1puUGZVTzFIVkpYUENXN1V3NFRCN2ZhUGdpMWw1ZnZkRFc0VjNKaWZEaWpEck9ORmYtLXpoaTBOeDgxUTdCZ3ZOTTREUWg5QklTYUV1TzR5ekFQYkFZZw&q=https%3A%2F%2Fleetcode.com%2Fproblems%2Fintersection-of-two-linked-lists%2F
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Intersection2Linkedlist {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lA = 0;
        int lB = 0;
        ListNode Atmp = headA;
        ListNode Btmp = headB;
        
        while (Atmp != null){
            lA++;
            Atmp = Atmp.next;
        }
        while (Btmp != null){
            lB++;
            Btmp = Btmp.next;
        }
        int diff = lB - lA;
        ListNode result = null;
        if (diff > 0){
            for (int i = 0; i < Math.abs(diff) ; i++){
                headB = headB.next;
            }
        }else if (diff < 0){
            for (int i = 0; i < Math.abs(diff) ; i++){
                headA = headA.next;
            }
        }
        
        while (headA != null){
                if (headA == headB){
                    result = headA;
                    break;
                }
                 
                headA = headA.next;
                headB = headB.next;
            }
        return result;
        
    }
	
	public ListNode BestOPgetIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummyA = headA;
        ListNode dummyB = headB;
        while (dummyA != dummyB){
            if (dummyA == null){
                dummyA = headB;
            }else{
                dummyA = dummyA.next;
            }
            if (dummyB == null){
                dummyB = headA;
            }else{
                dummyB = dummyB.next;
            }
        }
        return dummyB;
    }
	
	// Both Time: O(n) Space: O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
