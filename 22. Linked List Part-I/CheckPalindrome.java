public class CheckPalindrome {

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


    // Find the middle of LinkedList : Learn Slow Fast Approach
    public Node findMiddle(){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;
    }

    public boolean checkPal(){
        //Base case
        if(head==null || head.next ==null){
            return true;
        }

     // Step 1 : Find Mid
        Node midNode = findMiddle();
    // Step 2 : Reverse 2nd Half
        Node prev = null;
        Node curr = midNode;
        Node forward;
        while(curr!=null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        Node right = prev; // right is the head of 2nd Half
        Node left = head; // left is the head of 1st half
        
    // Step 3 : Check 1st half and 2nd Half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }


    public void PrintLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " --> ");
        temp = temp.next;
        }
        System.out.print("null");
    }
    
    public static void main(String[] args) {
        CheckPalindrome list = new CheckPalindrome();
        list.head = list.new Node(10);
        list.head.next = list.new Node(20);
        list.head.next.next = list.new Node(30);
        list.head.next.next.next = list.new Node(20);
        list.head.next.next.next.next = list.new Node(10);
        // list.head.next.next.next.next.next = list.new Node(10);

        System.out.println("Middle Node is : "  + list.findMiddle().data);

        System.out.println("Is this LinkedList is Palindrome ? -->" + list.checkPal());

        list.PrintLL();
    }
}
