package Day5;

import Day5.LinkedList.Node;

public class MergeTwoSortdList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addFirst(7);
		ll.addLast(2);
		ll.addLast(1);
		ll.display();
		Node mid = ll.findmid();
		ll.head = sortTwoLists(ll.head, mid);
		ll.display();
	}
	
	public static Node sortTwoLists(Node first, Node second) {
        Node dheadToReturn = new Node(-1);
        Node dhead = dheadToReturn;

        while(first != null && second != null) {
            if(first.val <= second.val) {
                dhead.next = first;
                first = first.next;
                dhead = dhead.next;
            }
            else {
                dhead.next = second;
                second = second.next;
                dhead = dhead.next;
            }
        }

        while(first != null) {
            dhead.next = first;
            first = first.next;
            dhead = dhead.next;
        }

        while(second != null) {
            dhead.next = second;
            second = second.next;
            dhead = dhead.next;
        }

        return dheadToReturn.next;
	}

}
