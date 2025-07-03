package DSA.DoublyLL;

public class insertAtAnyIndex {
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

        Node(int val){
            this.val = val;
        }
    }

    public static Node insert(Node head, int idx, int x){
        Node u = new Node(x);
        Node s = head;
        //Check that our s is at tail.
        if(s.next==null){
            //Means our s is at tail.
            s.next = u;
            u.prev = s;

            return head;
        }

        for(int i=1; i<idx; i++){
            s = s.next;
        }

        //Now s is at idx-1.

        Node r = s.next;
        s.next = u;
        u.prev = s;
        u.next = r;
        r.prev = u;

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

        display(a);
        insert(a, 0, 30);
        display(a);
    }
}