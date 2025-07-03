//package Practice.Practice;
//
//import DoublyLinkedList.insertAtAnyIndex;
//
//public class updateValue {
//    public static void display(Node head){
//       Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.val+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    public static class Node{
//        int val;
//        Node next;
//        Node prev;
//
//        Node(int val){
//            this.val = val;
//        }
//    }
//    public static Node update(Node head, int idx, int val){
//        Node temp=head;
//        for(int i=1; i<=idx; i++){
//            temp=temp.next;
//        }
//        temp.val=val;
//        return head;
//    }
//    public static void main(String[] args) {
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        Node f = new Node(6);
//        Node g = new Node(7);
//
//        a.prev = null;
//        a.next = b;
//        b.prev = a;
//        b.next = c;
//        c.prev = b;
//        c.next = d;
//        d.prev = c;
//        d.next = e;
//        e.prev = d;
//        e.next = f;
//        f.prev = e;
//        f.next = g;
//        g.prev = f;
//        g.next = null;
//
//        System.out.println("Original List");
//        display(a);
//        System.out.println("Updated List");
//        Node temp=update(a, 2, 14);
//        display(temp);
//    }
//}
