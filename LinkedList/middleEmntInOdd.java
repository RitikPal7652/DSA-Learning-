package DSA.LinkedList;

public class middleEmntInOdd {
    public static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){ //Constructor.
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node middle = findMiddle(head);
        System.out.println(middle.data);
    }
}
