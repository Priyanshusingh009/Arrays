class Node {
    int data;       // value of this node
    Node next;      // reference (link) to the next node

    Node(int data) {
        this.data = data;
        this.next = null; // initially, no next node
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);   // first node
        Node second = new Node(20); // second node
        Node third = new Node(30);  // third node

        // Step 2: Link them together using 'next'
        head.next = second;  // head node points to second
        second.next = third; // second node points to third
                            // third.next remains null → means end of list

        //  Traversal - start from head and move via 'next'
        Node temp = head;
        System.out.println("Linked List elements (with diagram):");
        while (temp != null) {
            System.out.print(temp.data + " -> "); // print value
            temp = temp.next; // move to the next node
        }
        System.out.println("null"); // end of list
    }
    
}
