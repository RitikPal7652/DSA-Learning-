//package Practice.Practice;
//
//import DoublyLinkedList.insertAtAnyIndex;
//import DoublyLinkedList.insertAtHead;
//
//public class delelteNode {
//    public static int sizeLL(Node head){
//        Node temp=head;
//        int size=0;
//        while(temp!=null){
//            size++;
//            temp=temp.next;
//        }
//        return size;
//    }
//    public static void display(Node head){
//        Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.val+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    public static class Node {
//        int val;
//        Node next;
//        Node prev;
//
//        Node(int val){
//            this.val = val;
//        }
//    }
//    public static Node deleteAtAnyIndex(Node head, int idx) {
//        Node temp = head;
//        int size=sizeLL(head);
//        //If we have to delete head from Linked List.
//        if (idx == 0) {
//            temp = temp.next;
//            temp.prev = null;
//            head = head.next;
//
//            return head;
//        }
//        else if (idx == size-1) {
//            while (temp.next.next != null) {
//                temp = temp.next;
//            }
//            temp.next = null;
//            return head;
//        }
//        else {
//            //If we have to delete any random index from LL.
//            for (int i = 1; i < idx; i++) {
//                temp = temp.next;
//            }
//            temp.next = temp.next.next;
//            return head;
//        }
//    }
//    public static void main(String[] args) {
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        Node f = new Node(6);
//
//        // null<-1<-->2<-->3<-->4<-->5->null
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
//        f.prev = null;
//
//        Node temp = deleteAtAnyIndex(a, 5);
//        display(temp);
//    }
//}
