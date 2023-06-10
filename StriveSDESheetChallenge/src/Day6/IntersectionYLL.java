package Day6;

import Day5.LinkedList;
import Day5.LinkedList.Node;

public class IntersectionYLL {

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
		System.out.println(findIntersection(ll.head, mid));
	}
	
	public static int findIntersection(Node firstHead, Node secondHead) {
        if(firstHead == null || secondHead == null) return -1;
        Node f = firstHead;
        Node s = secondHead;
        while(f != s) {
            f = f == null ? secondHead : f.next;
            s = s == null ? firstHead : s.next;
        }
        return f == null ? -1 : f.val;
    }

}
