package DSA.DoublyLL;

public class insertAtHead {
    public static void display(Node head){
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
    }

    public static Node insert(Node head, int x){
        Node temp = new Node(x);
        temp.next = head;
        head.prev = temp;
        head = temp;

        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(1);
        Node f = new Node(2);

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

        display(a);
        Node t = insert(a, 30);
        display(t);
    }
}
