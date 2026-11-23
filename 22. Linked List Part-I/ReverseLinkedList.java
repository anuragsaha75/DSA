// To revise linkedlist watch video of Love Babbar Linked List Reversa/
//  https://www.youtube.com/watch?v=RPPgszbdYqQ

public class ReverseLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    void reverseLinkedList() {
        Node prev = null;
        Node curr = head;
        Node forward;

        while (curr != null) {

            // Step 1: Store the next node
            forward = curr.next;

            // Step 2: Reverse the link
            curr.next = prev;

            // Step 3: Move prev forward
            prev = curr;

            // Step 4: Move curr forward
            curr = forward;
        }

        // Update head and tail
        tail = head;
        head = prev;
    }

    void PrintLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String args[]) {

        ReverseLinkedList list = new ReverseLinkedList();

        list.head = list.new Node(10);
        list.head.next = list.new Node(20);
        list.head.next.next = list.new Node(30);
        list.head.next.next.next = list.new Node(40);
        list.head.next.next.next.next = list.new Node(50);

        list.reverseLinkedList();

        list.PrintLL();
    }
}
