package DSA.DoublyLL;

public class insertAtTail {
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){this.val = val;}
    }

    public static Node insert(Node head){
        Node t = new Node(30);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = t;
        t.prev = temp;

        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        // null<-1<-->2<-->3<-->4<-->5->null
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
        f.prev = null;

       // System.out.println(e.val);
        display(a);
        Node t = insert(a);
        display(a);

    }
}
