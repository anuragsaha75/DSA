public class PrintLinkedList {

    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;


    public static void PrintLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " --> ");
        temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        PrintLinkedList  L1 = new PrintLinkedList();
        Node first = new Node (1);
        Node second = new Node (2);
        Node third = new Node (3);
        Node fourth = new Node (4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        L1.head = first;
        L1.tail = fourth;

        PrintLL();
        
    }
}
