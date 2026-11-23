
import java.util.*;

public class Remove_nthNode_fromEnd {
    
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

    void Remove_nth_Node_from_end(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter n'th value from end, which is to be deleted");
        int n = sc.nextInt();

        // n'th node from end means (size-n+1) from start.

        // Calculating Size
        int size = 0 ;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }

        // So, calculating n'th node from start

        int n_fromStart = size - n +1;

        Node prev = null;
        Node curr = head;
        Node forward;

        int idx = n_fromStart-1;
        // so, this index is to be deleted

        if(idx==0){
            head = head.next;
            return;
        }

        for(int i=0; i<idx; i++){
            forward = curr.next;
            prev = curr;
            curr = forward;   
        }

          prev.next = curr.next;


        // If user wants to delete the last node, tail reference will still point to the deleted node.
        // So we need to fix that
        
        if (idx == size - 1) {
                tail = prev;
            }
        
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

        Remove_nthNode_fromEnd list = new Remove_nthNode_fromEnd();

        list.head = list.new Node(10);
        list.head.next = list.new Node(20);
        list.head.next.next = list.new Node(30);
        list.head.next.next.next = list.new Node(40);
        list.head.next.next.next.next = list.new Node(50);

        list.PrintLL();

        list.Remove_nth_Node_from_end();
        list.PrintLL();
        
    }
}
