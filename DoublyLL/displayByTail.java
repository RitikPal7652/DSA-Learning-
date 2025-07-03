package DSA.DoublyLL;

public class displayByTail {

    public static void displayReverse(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

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
        e.next = null;

        displayReverse(e);
    }
}
