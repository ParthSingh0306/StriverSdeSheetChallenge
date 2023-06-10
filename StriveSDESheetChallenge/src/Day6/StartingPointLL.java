package Day6;

import Day5.LinkedList;
import Day5.LinkedList.Node;

public class StartingPointLL {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addFirst(7);
		ll.addLast(2);
		ll.addLast(1);
		ll.display();
		Node temp = ll.head;
		while(temp.next != null) temp = temp.next;
		temp.next = ll.head.next.next;
		System.out.println(firstNode(ll.head).val);
	}
	
	public static Node firstNode(Node head) {
        if(head == null || head.next == null) return null;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }

        if(slow != fast) return null;

        fast = head;

        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

}
