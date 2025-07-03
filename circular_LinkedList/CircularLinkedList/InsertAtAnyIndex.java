package DSA.circular_LinkedList.CircularLinkedList;

public class InsertAtAnyIndex {
    public static int size(Node head){
        Node temp = head;
        int size=0;
        while(temp.next!=head){
            size++;
        }

        return size++;
    }
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

    public static Node insert(Node head, int idx, int value){
        Node temp = head;
        Node t = new Node(value);
        //Insert at head.
        if(idx==0){
            t.next = head;
            head = t;

            //To move temp node to tail node
            while(temp.next!=head){
                temp = temp.next;
            }

            t.prev = temp;

            return head;
        }

        int size = size(head);
        //Insert at end.
        if(idx==size-1){
            t.next = head;

            return head;
        }
        for(int i=1; i<idx; i++){
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next.prev = t;
        temp.next = t;
        t.prev =temp;

        return head;
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
        Node temp = insert(a, 2, 10);
        display(temp);
    }
}
