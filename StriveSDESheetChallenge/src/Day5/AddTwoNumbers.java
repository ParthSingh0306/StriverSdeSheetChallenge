package Day5;

import Day5.LinkedList.Node;

public class AddTwoNumbers {

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
		ll.head = addTwoNumbers(ll.head, mid);
		ll.display();
	}
	
	public static Node addTwoNumbers(Node l1, Node l2) {
        Node dhead = new Node(0);
        Node temp = dhead;
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum/10;
            Node toadd = new Node(sum%10);
            temp.next = toadd;
            temp = temp.next;
        }
        return dhead.next;
    }

}
