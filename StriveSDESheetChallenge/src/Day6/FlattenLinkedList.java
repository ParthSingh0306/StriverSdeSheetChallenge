package Day6;

public class FlattenLinkedList {
	
	 static class Node {
	     public int data;
	     public Node next;
	     public Node child;

	     public Node()
	     {
	         this.data = 0;
	         this.next = null;
	         this.child = null;
	     }
	     public Node(int data)
	     {
	         this.data = data;
	         this.next = null;
	         this.child = null;
	     }
	     public Node(int data, Node next, Node child)
	     {
	         this.data = data;
	         this.next = next;
	         this.child = child;
	     }
	 }
	
	public static Node flattenLinkedList(Node head) {
        if(head == null || head.next == null) return head;
        head.next = flattenLinkedList(head.next);
        head = merge(head, head.next);
        return head;
    }

    public static Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node temp = dummy;

        a.next = null;
        b.next = null;
        
        while(a != null && b != null) {
            if(a.data < b.data) {
                temp.child = a;
                a = a.child;
                temp = temp.child;
            }
            else {
                temp.child = b;
                b = b.child;
                temp = temp.child;
            }
        }
        
        if(a != null) temp.child = a;
        else temp.child = b;
        
        return dummy.child;
    }
}
