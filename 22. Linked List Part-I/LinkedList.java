/**
 * LinkedList
 */
public class LinkedList {

    public static class Node{

        int data ;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    // addFirst()
    public void addNode_in_First(int data){   
        // STEP-> 01 Creating New Node
        Node newNode = new Node(data);
        size++;
        // STEP-> 02 If No Node was there
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // STEP-> 03 Linking New node's tail to previous first node's Head. so that Head changes to new node's head
        newNode.next = head;
        head = newNode;
    }

    // addLast()
    public void addNode_in_last(int data){
        //STEP-> 01 Creating New Node
            Node newNode = new Node(data);
            size++;
        // STEP-> 1.1 If No Node was there
            if (head == null) {
                head = tail = newNode;
                return;
            }
        // STEP-> 02 Pointing the previous tail's next part towards newNode
            tail.next = newNode;
        // // STEP-> 03 Make new Node as tail
            tail = newNode;
    }

    public void InsertNode_anywhere(int idx, int data){
        Node newNode = new Node(data);
        int i=0;
        Node temp = head;
        if(idx ==0){
            addNode_in_First(data);
            return;
        }

        size++;
        while(i<idx-1){
            temp = temp.next;
            i++ ;
        }
        newNode.next = temp.next;  
        temp.next = newNode;
    }

    public static void PrintLinkedList(){
        Node temp = head ;
        while(temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void removeFirst(){
        if(size==0){
            System.out.println("Deletion Can not be performed because LINKED LIST  IS EMPTY");
        } else if(size==1){
            int val = head.data;
            head = head.next;
            head= tail = null;
            size =0;
            System.out.println("Removed First element is "+ val);
        }
        int val = head.data;
        head = head.next;
        size--;
        System.out.println("Removed First element is "+ val);
    }

    public static void removeLast(){
        if(size==0){
            System.out.println("Deletion Can not be performed because LINKED LIST  IS EMPTY");
        } else if(size ==1){
            int val = head.data;
            head = tail = null;
            System.out.println("Removed Last element is "+ val);
            size = 0;
        }

        Node prev = head;
        for(int i=0; i<size-2;i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        System.out.println("Removed Last element is "+ val);
        
    }


    public static void main(String args[]){
        LinkedList L1 =  new LinkedList();
        // L1.head = new Node(1);
        // L1.head.next = new Node(2);

        L1.addNode_in_First(1);
        L1.addNode_in_last(3);
        L1.addNode_in_last(4);
        L1.InsertNode_anywhere(1, 2);

        L1.PrintLinkedList();
        System.out.println();
        System.out.println("Linked List Size is " +L1.size);
        L1.removeFirst();
        L1.PrintLinkedList();
        System.out.println();
        L1.removeLast();
        L1.PrintLinkedList();
    }
}