package Day5;

import Day5.LinkedList.Node;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.display();
		Reverse(ll);
		ll.display();
	}
	
	public static Node Reverse(LinkedList ll) {
		if(ll.head == null || ll.head.next == null) return ll.head;

		Node prev = null;
		Node curr = ll.head;
		Node next = ll.head;

		while(curr != null) {
			next = next.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return ll.head = prev;
    }

}
