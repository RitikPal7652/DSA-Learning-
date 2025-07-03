package DSA.Problems.problems;

public class printReverse {
    public static void printUlta(Node head){
        Node temp = head;
        if(temp==null) return;
        printUlta(temp.next);
        System.out.print(temp.data + " ");
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
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

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        printUlta(a);
        System.out.println();
        System.out.println(e.next.data);
    }
}
