public class RemoveCycle {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    void removeCycle_in_LL(){
        Node fast = head;
        Node slow = head;
        
        while(fast!=null && fast.next !=null){
            fast = fast.next.next; // +2 Step
            slow = slow.next; // +1 Step

            if(slow==fast){
                slow = head; // slow again starts from head and 
                Node prev = null;
                while(fast!=slow){
                    prev = fast;
                    fast = fast.next; // Now fast also start moving by +1 Step
                    slow = slow.next; //+1 Step walk
                }
                prev.next = null;
                break;
            }
        }
    }

    void printLinkedList(){
        Node temp = head;
        while(temp!=null){
                System.out.print(temp.data + "-->");
                temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        RemoveCycle list = new RemoveCycle();

            list.head = list.new Node(10);
            list.head.next = list.new Node(20);
            list.head.next.next = list.new Node(30);
            list.head.next.next.next = list.new Node(40);
            list.head.next.next.next.next = list.new Node(50);

            // Creating a cycle: Node 50 points to Node 20
            list.head.next.next.next.next.next = list.head.next;

        System.out.println("Removing cycle from the LinkedList...");
         list.removeCycle_in_LL();
         list.printLinkedList();

    }
    
}
