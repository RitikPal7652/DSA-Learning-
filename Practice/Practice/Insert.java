package DSA.Practice.Practice;

public class Insert {
    public static int sizeOfLL(Node head){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public static Node insertAtStart(Node head, int val){
        Node t = new Node(val);
        t.next = head;
        t.prev=null;
        head=t;

        return head;
    }
    public static Node insertAtAnyIndex(Node head, int idx, int val){
        Node temp=head;
        Node t = new Node(val);  //Make a new node which is common for all.
        int size=sizeOfLL(head); //To calculate the size of LinkedList in case if we have to insert at end.

        if(idx==0){             // Means if we have to insert at head.
           Node temp1 = insertAtStart(head, val); //Call the function which will insert at start position.
            return temp1;
        }
        else if(idx==size){     //If we have to insert at tail.For this reason we calculate size of LL.
            Node temp1 = insertAtEnd(head, val);
            return temp1;
        }
        else { //Insert at any random index.
            for(int i=1; i<idx; i++){
                temp=temp.next;
            }

            if(temp.next==null){
                Node temp1 = insertAtEnd(head, val);
                return temp1;
            }
            t.next = temp.next;
            temp.next.prev = t;
            temp.next = t;
            t.prev = temp;

            return head;
        }
    }
    public static Node insertAtEnd(Node head, int val){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t = new Node(val);
        temp.next=t;
        t.prev=temp;

        return head;
    }
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){ //Constructor.
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
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
        Node g = new Node(7);

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
        f.next = g;
        g.prev = f;
        g.next = null;

        System.out.println("Original List");
        display(a);
        System.out.println("Insert At any index");
        Node temp2 = insertAtAnyIndex(a, 7, 54);
        display(temp2);
    }
}
