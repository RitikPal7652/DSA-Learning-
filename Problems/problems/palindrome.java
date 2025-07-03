package DSA.Problems.problems;

public class palindrome {
    public static Node middleElmnt(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node reverseByRec(Node head){
       Node prev = null;
       Node curr = head;
       Node Next = null;

       while(curr!=null){
           Next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = Next;
       }
       return prev;
    }
    public static boolean isPalindrome(Node head){
        //To find the middle Element from LinkedList.
        Node middle = middleElmnt(head); //3

        //To reverse the LinkedList after the middle element.
        Node middleNext = reverseByRec(middle.next);

        //To join the two lists: head to middle; middle to middleNext; middleNext to tail.
        middle.next = middleNext;

        //Pointers that will point on head and middleNext.
        Node t1 = head;
        Node t2 = middle.next;

        //Loop will run till middle.next bcoz at middle element it will break.
        while(t1!=middle.next) {
            if (t1.val!= t2.val) return false;

            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
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
        Node f = new Node(5);
        Node g = new Node(4);
        Node h = new Node(3);
        Node i = new Node(2);
        Node j = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;
        System.out.println(isPalindrome(a));
    }
}
