public class DetectCycle {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    
    // This function is also known as Floyd's Cycle Finding Algorithm
    boolean detectCycle(){
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next; // +1 Step
            fast = fast.next.next; // +2 Step
            if(slow==fast){
                return true; // cycle detected
            }
        }
        return false; // cycle not detected
    }

    public static void main(String[] args) {
        DetectCycle list = new DetectCycle();

            list.head = list.new Node(10);
            list.head.next = list.new Node(20);
            list.head.next.next = list.new Node(30);
            list.head.next.next.next = list.new Node(40);
            list.head.next.next.next.next = list.new Node(50);

            // Creating a cycle: Node 50 points to Node 20
            list.head.next.next.next.next.next = list.head.next;

        System.out.println("Does the Linked List have cycle? --> " + list.detectCycle());


    }
}
