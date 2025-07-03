package DSA.Problems.problems;

public class twinSum {
    public static Node middleElmnt(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next.next!=null){
            //If we not place firstly odd condition then in some cases, it will give an error.
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node reverseList(Node head){
        Node curr = head;
        Node prev = null;
        Node Next = null;

        while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
    public static int twinsum(Node head){
        int sum = Integer.MIN_VALUE;
        Node middle = middleElmnt(head);
        Node middleNext = reverseList(middle.next);

        middle.next = middleNext; //To join the two lists.

        Node t1 = head;
        Node t2 = middle.next;

        while(t1!=middle.next){
            int sum2 = t1.val+t2.val;
            if(sum2>sum){
                sum = sum2;
            }

            t1 = t1.next;
            t2 = t2.next;
        }
        return sum;
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
        Node c = new Node(10);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        int sum = twinsum(a);
        System.out.println("Maximum twin sum in the linkedList is: "+sum);
    }
}
