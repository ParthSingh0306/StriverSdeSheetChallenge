package Day5;

import Day5.LinkedList.Node;

public class deleteKthNode {

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
		
		removeKthNode(ll.head, k);
		
		ll.display();
	}
	
	public static Node removeKthNode(Node head, int K){
        int size = 0;
        Node curr = head;
        while(curr != null) {
            size++;
            curr = curr.next;
        }

        if(size - K == 0) {
            head = head.next;
            return head;
        }

        int newSize = size - K - 1;
        Node todel = head;
        while(newSize-- > 0) {
            todel = todel.next;
        }

        todel.next = todel.next.next;
        return head;
    }

}
