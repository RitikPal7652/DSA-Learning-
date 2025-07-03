package DSA.DoublyLL;

public class deleteAtAnyIdx {
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

    public static int sizeOfLl(Node head){
        Node temp = head;
        int size=0;

        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    public static Node delete(Node head, int idx){
        Node temp = head;

       //If we delete first Element or head of Node.
       if(idx==0) {
           temp = temp.next;
           temp.prev = null;

           return temp;
       }

       int size = sizeOfLl(head);

       //If we delete last element or tail of node.
        if(idx==size-1){
            //Means we are at tail.
            for(int i=1; i<idx; i++){
                temp = temp.next;
            }
            temp.next = null;

            return head;
        }

        for(int i=1; i<idx; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;

        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(7);
        Node e = new Node(9);
        Node f = new Node(32);

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

        System.out.println("Original List");
       display(a);
       Node temp = delete(a, 5);
        System.out.println("Changed List");
       display(temp);
    }
}
