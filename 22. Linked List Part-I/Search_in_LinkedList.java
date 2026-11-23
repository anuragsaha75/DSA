public class Search_in_LinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void Iterative_search(int key) {
        // Write your searching logic here
        Node temp = head;
        int idx=0;
        while(temp!=null){
            if(temp.data==key){
                System.out.println("Key is found in index number "+ idx);
                return;
            } 
            temp = temp.next;
            idx++;
        }
        
        System.out.println("NOT FOUND / NOT A VALID KEY");
            
    }


    public  int Rescurcive_Search(int key){
        return recSearch_util(head, key);
    }

    public  int recSearch_util(Node head, int key){
        
        if(head==null){
            return -1;
        }
        if(head.data == key){
            return 0; // 0 bcz head's index is zero
        }
        int idx = recSearch_util(head.next, key);
        if(idx == -1){
            return -1;
        } else{
            return idx + 1;  // If the key was found, add 1 to its index to account for the current node
        }
    }

    public static void main(String[] args) {
        Search_in_LinkedList list = new Search_in_LinkedList();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next = new Node(50);

        list.Iterative_search(30);
        
        System.out.println(list.Rescurcive_Search(30));
    }
}