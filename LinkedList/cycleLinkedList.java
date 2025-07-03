package DSA.LinkedList;

public class cycleLinkedList {
    public static boolean cyclicList(Node a){
        if(a==null){
            return false;
        }
        if(a.next==null){
            return false;
        }
        Node slow = a;
        Node fast = a;

        while(fast!=null){
            if(slow==null) return false;
            slow = slow.next;

            if(fast.next==null) return false;
            fast = fast.next.next;

            if(fast==slow){
                return true;
            }
        }
        return false;
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

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        
    }
}
