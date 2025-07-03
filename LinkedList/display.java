package DSA.LinkedList;

public class display {
    public static void displays(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        //5 6 7 8 9
        a.next = b;         //5 -> 6   7  8   9
        b.next = c;         //5 -> 6 ->  7  8   9
        c.next = d;         //5 -> 6 ->  7 -> 8   9
        d.next = e;         //5 -> 6 -> 7 ->  8 -> 9

        //Printing the LinkList when head node is given.
//        Node temp = a; //Start with first Node, temp points to ath node.
//        for(int i=1; i<=5; i++){
//            System.out.print(temp.data + " ");
//            temp = temp.next; //Means address of next Node, and address of next node is actually
//                                // the next node.
//        }

        //If we don't know the size of LinkList then we can display but using while loop when head node is given.
//        while(temp!=null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
        displays(a);
    }
}
