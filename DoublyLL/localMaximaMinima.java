package DSA.DoublyLL;

public class localMaximaMinima {
    public static void maximaAndMinima(Node head){
        
    }
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){ this.val = val;}
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

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
        f.next = null;
    }
}
