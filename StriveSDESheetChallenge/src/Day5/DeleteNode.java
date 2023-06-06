package Day5;

import Day5.LinkedList.Node;

public class DeleteNode {

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
		Node todel = ll.head;
		while(k-->0) todel = todel.next;
		
		deleteNode(todel);
		
		ll.display();
	}
	
	public static void deleteNode(Node node) {
        if(node == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
	}

}
