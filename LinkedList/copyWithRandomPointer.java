package DSA.LinkedList;

public class copyWithRandomPointer {
    public static class Node{
        int val;
        Node next;
        Node random;

        Node(int val){ this.val = val; }
    }

    public static Node randomPointer(Node head){
        Node deepCopyHead = new Node(-1);
        Node t2 = deepCopyHead;
        Node t1 = head;

        //Step 1: Make a deep copy.
        while(t1!=null){
            Node nva = new Node(t1.val);
            t2.next = nva;
            t2 = nva;

            t1 = t1.next;
        }
        deepCopyHead = deepCopyHead.next;
        t2 = deepCopyHead;

        t1 = head;
        Node t = new Node(-1);
        Node h = t;

        //Step 2: Alternate connections between original list and deep copy.
        while(t1!=null){
            h.next = t1;
            t1 = t1.next;
            h = h.next;

            h.next = t2;
            t2 = t2.next;
            h = h.next;
        }
        t1 = head;
        t2 = deepCopyHead;

        //Step 3:  Assigning random pointers on Deep copy list.
        while(t1!=null && t2!=null) {
            if (t1.random == null) {
                t2.random = null;
            } else {
                t2.random = t1.random.next;
            }
                t1 = t2.next;
                if (t1!=null) t2 = t1.next;

        }
        t1=head;
        t2=deepCopyHead;
        //Step 4: Again join the two lists as these were. OR separating the to lists.
        while(t1!=null){
            t1.next = t2.next;
            t1 = t1.next;
            if(t1.next==null) break;
            t2.next = t1.next;
            if(t2.next==null) break;
            t2 = t2.next;
        }
        return deepCopyHead;
    }
    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(13);
        Node c = new Node(11);
        Node d = new Node(10);
        Node e = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

    }
}
