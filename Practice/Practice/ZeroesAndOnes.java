package DSA.Practice.Practice;

public class ZeroesAndOnes {
    public static Node insertZeroes(Node head){
        Node temp=head.next;

        while(temp!=null){
            int size=0;

            while(temp.val!=1){
                size++;
                temp=temp.next;
            }

            if(size%2!=0){
                Node t=new Node(0);
                temp=temp.prev;
                t.next=temp.next;
                temp.next.prev=t;
                temp.next=t;
                t.prev=temp;

                temp=temp.next.next;
            }
            else{
                if(temp.next==null) return head;
                temp=temp.next;
            }
        }
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(0);
        Node c = new Node(0);
        Node d = new Node(1);
        Node e = new Node(0);
        Node f = new Node(1);

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

        System.out.println("Original List");
        display(a);
        System.out.println("Changed List");
        Node temp = insertZeroes(a);
        display(temp);
    }
}
