package DSA.circular_LinkedList.CircularLinkedList;

public class display {
    public static void display(Node head){
        Node temp = head;

        while(temp.next!=head){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.print(temp.val);
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
        Node b = new Node(5);
        Node c = new Node(34);
        Node d = new Node(19);
        Node e = new Node(7);

        a.prev = e;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = a;

        display(a);
    }
}
