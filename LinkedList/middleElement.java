package DSA.LinkedList;

public class middleElement {
    public static Node findMiddleLeftEmnt(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node findRightMiddleElmt(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null){
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
        Node f = new Node(60);
        //Node g = new Node(70);

        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        //f.next = g;

        Node leftmiddle = findMiddleLeftEmnt(head);
        Node rightMiddle = findRightMiddleElmt(head);
        System.out.println("Left Middle element is: "+(leftmiddle.data));
        System.out.println("Right Middle Element is: "+(rightMiddle.data));
    }
}
