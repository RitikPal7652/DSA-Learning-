package DSA.LinkedList;

public class removeEndByOneTrav {
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node removeFromEnd(Node head, int n){
        /*
        Floyd's Cycle Algorithm
                or
        Hare-Tortoise Algorithm
         */
        Node slow = head;
        Node fast = head;

        for(int i=1; i<=n; i++){ //
            fast = fast.next;
        }

        if(fast==null){       // This is just for removing the first Element from the Linked-List.
            head = head.next; // if fast is already reached at null position it can't go beyond then.
            return head;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(40);
        Node b = new Node(50);
        Node c = new Node(60);
        Node d = new Node(70);
        Node e = new Node(80);
        Node f = new Node(90);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        a=removeFromEnd(a, 6);
        display(a);
    }
}
