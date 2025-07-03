package DSA.DoublyLL;

public class PENDINGtwoSumDLL {
    public static int sizeDll(Node head){
        Node temp = head;
        int size=0;
        while(temp.next!=null){
            size++;
        }
        return size;
    }
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
    }

    public static void twoSum(Node head, int target) {
        //Given LinkedList is sorted.
        //We can apply Binary search here.

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        Node h = head;
        Node t = temp;
        int Head = 0;
        int Tail = sizeDll(head)-1;

        while (h.val < t.val) {
            if (h.val + t.val == target) {
                System.out.println(+Head + "   " + Tail);
                return;
            }
            else if (h.val + t.val < target) {
                h = h.next;
                Head++;
            }
            else {
                t = t.prev;
                Tail--;
            }
        }
    }
    public static void main(String[] args) {
       Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(10);

        a.prev = null;
        a.next = b;
        b.prev =a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        twoSum(a, 9);

    }
}
