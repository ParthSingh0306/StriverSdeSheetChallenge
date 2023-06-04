package Day5;

import Day5.LinkedList.Node;

public class MiddleOfLinledList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.display();
		System.out.println(middle(ll).val);
	}
	
	public static Node middle(LinkedList ll) {
		if(ll.head == null || ll.head.next == null) return ll.head;

        Node slow = ll.head;
        Node fast = ll.head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
	}

}
