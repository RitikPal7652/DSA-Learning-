package DSA.LinkedList;

public class deleteMiddleElmt {
   static void deleteRightMiddleInEven(Node a){
        Node slow = a;
        Node fast = a;

        while(fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void deleteLeftMiddleElmt(Node a){
       Node slow = a;
       Node fast = a;

       while(fast.next.next.next.next!=null){
           slow = slow.next;
           fast = fast.next.next;
       }
       slow.next = slow.next.next;
    }
    public static void deleteElmtInOdd(Node a){
        Node slow = a;
        Node fast = a;

        while(fast.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println("Original List is: ");
        display(a);

//       // deleteElmt(a);

//      System.out.println("By deleting left Middle element List is: ");
//      deleteLeftMiddleElmt(a);
//        display(a);

        System.out.println("By deleting right middle element List is: ");
        deleteRightMiddleInEven(a);
        display(a);
    }
}
