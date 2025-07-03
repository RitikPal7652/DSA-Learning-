package DSA.Practice.Practice;

public class traveral {
    public static void traverseFromStart(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void traverseFromEnd(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        //Now our temp is at tail.
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){ //Constructor.
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        f.next = g;
        g.prev = f;
        g.next = null;

        System.out.println("Forward Linked List");
        traverseFromStart(a);
        System.out.println("Reverse Linked List");
        traverseFromEnd(a);
    }
}
