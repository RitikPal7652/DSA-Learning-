package DSA.LinkedList;

public class OddEvenIndexSeparate {
    public static void display(Node head){
        Node temp = head;
        if(temp==null) return;
        System.out.print(temp.val + " ");
        display(temp.next);
    }
    public static Node oddEvensplit(Node head) {
        Node o = new Node(-1);
        Node e = new Node(-2);

        Node temp = head;
        Node tempO = o;
        Node tempE = e;

        while (temp != null) {
            tempO.next = temp;
            temp = temp.next;
            tempO = tempO.next;

            tempE.next = temp;
            if(temp==null) break;
            temp = temp.next;
            tempE = tempE.next;
        }

        o = o.next;
        e = e.next;
        tempO.next = e;

        return head;
    }
    public static class Node{
        int val;
        Node next;

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
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        System.out.println();
        Node temp = oddEvensplit(a);
        System.out.println("Odd Even Index LinkList is: ");
        display(temp);
    }
}
