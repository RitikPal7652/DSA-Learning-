package DSA.Problems.problems;

public class removeKthNode {
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node findKth(Node head, int k){
        Node slow = head;
        Node fast = head;

        for(int i=1; i<=k; i++){
            fast = fast.next;
        }

        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
//        if(slow.next==null) return slow;
        slow.next = slow.next.next;
        return head;
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

        display(a);
        Node temp = findKth(a, 3);
        display(temp);
    }
}
