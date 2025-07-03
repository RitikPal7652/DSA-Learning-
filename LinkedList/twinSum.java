package DSA.LinkedList;

public class twinSum {
    public static Node middle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node reverse(Node head){
        if(head.next==null){
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static int twinSum(Node head) {
        int maximum = Integer.MIN_VALUE;
        Node middle = middle(head);
        Node temp = reverse(middle.next);

        middle.next = temp;

        Node p1 = head;
        Node p2 = middle.next;


        while(p1!=middle.next){
            int sum = p1.val+p2.val;
            if(sum>maximum){
                maximum = sum;
            }

            p1 = p1.next;
            p2 = p2.next;
        }
        return maximum;
    }
    public static class Node{
        int val;
        Node next;

        Node(int val){
           this.val = val;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(10);
        Node c = new Node(13);
        Node d = new Node(4);
        Node e = new Node(2);
        Node f = new Node(7);
        Node g = new Node(6);
        Node h = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        int max = twinSum(a);
        System.out.println("Maximum Twin sum is: "+max);
    }
}
