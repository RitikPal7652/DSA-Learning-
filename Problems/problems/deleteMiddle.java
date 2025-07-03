package DSA.Problems.problems;

public class deleteMiddle {
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node middle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
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
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
     //   Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
      //  e.next = f;

        display(a);
        Node temp = middle(a);
        display(temp);

    }
}
