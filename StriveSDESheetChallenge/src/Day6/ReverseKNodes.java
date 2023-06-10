package Day6;

import Day5.LinkedList;
import Day5.LinkedList.Node;

public class ReverseKNodes {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addFirst(7);
		ll.addLast(2);
		ll.addLast(1);
		ll.display();
		int k = 2;
		ll.head = reverseKGroup(ll.head, k);
		ll.display();
	}
	
	public static Node reverseKGroup(Node head, int k) {
        if(head == null || k == 1) return head;

        Node dummy = new Node(0);
        dummy.next = head;

        Node pre = dummy, curr = dummy, next = dummy;

        int cnt = 0;

        while(curr.next != null) {
            curr = curr.next;
            cnt++;
        }

        while(cnt >= k) {
            curr = pre.next;
            next = curr.next;
            for(int i=1; i<k; i++) {
                curr.next = next.next;
                next.next = pre.next;
                pre.next = next;
                next = curr.next;
            }
            pre = curr;
            cnt -= k;
        }

        return dummy.next;
    }

}
