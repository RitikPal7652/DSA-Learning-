package DSA.Problems.problems;

public class makeReallyReverse {
    public static void display(Node head){
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayByRec(Node head){
        Node temp = head;
        if(temp==null) return;
        System.out.print(temp.val + " ");
        displayByRec(temp.next);
    }
    public static Node reverse(Node head){
        Node prev = null;
        Node agla = null;
        Node curr = head;

        while(curr!=null) {  //Also we apply if (Next!=null).
        agla = curr.next;
        curr.next = prev;
        prev = curr;
        curr = agla;

        }
        return prev;
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
        Node temp = reverse(a);
        display(temp);

        System.out.println(b.next.val);

    }
}
