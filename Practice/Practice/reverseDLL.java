package DSA.Practice.Practice;


public class reverseDLL {
    public static Node reverse(Node head){
        Node prev=null;
        Node Next=null;
        Node curr=head;

        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val=val;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
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

        System.out.println("Original Linked List");
        display(a);
        Node temp = reverse(a);
        System.out.println("Reverse Linked list");
        display(temp);
        System.out.println(e.next.val);
    }
}
