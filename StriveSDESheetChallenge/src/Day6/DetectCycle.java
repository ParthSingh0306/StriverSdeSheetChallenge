package Day6;

import Day5.LinkedList;
import Day5.LinkedList.Node;

public class DetectCycle {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		Node two = ll.head.next;
		Node temp = ll.head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = two;
		System.out.println(detectCycle(ll.head));
	}
	
	
	public static boolean detectCycle(Node head) {
        if(head == null) return false;

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }

        return false;
    }
}
