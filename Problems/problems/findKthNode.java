package DSA.Problems.problems;

public class findKthNode {
    public static Node findKth(Node head, int k){
        Node slow = head;
        Node fast = head;

        for(int i=1; i<=k; i++){
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
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
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node temp = findKth(a, 4);
        System.out.println(temp.val);
    }
}
