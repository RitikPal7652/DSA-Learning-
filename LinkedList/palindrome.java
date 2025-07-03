package DSA.LinkedList;

public class palindrome {
    public static Node reverseList(Node head){
        Node curr = head;
        Node after = null;
        Node prev = null;

        while(curr!=null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }

            return prev; //Return previous (prev) because at last prev is the head for reverse list.
    }

    //To find the middle element of node.
    public static Node middle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next.next!=null){ // Odd && Even.
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean isPalindrome(Node head){
        //Find the middle element.
        Node middle = middle(head);

        //Reverse the LinkList after the middle element.
        Node temp = reverseList(middle.next);

        //Join the two list; before and upto middle element and after middle element.
        middle.next = temp;

        //Pointer p1 points on head(starting) and p2 points on next of the middle element.
        Node p1 = head;
        Node p2 = middle.next;

        //Loop will run till then pointer in not pointed upto middle element.
        while(p1!=middle.next){

            //If at any point both of the pointers will not match, then return false.
            if(p1.val!=p2.val){
                return false;
            }

            //Otherwise increement pointer p1 and p2 by one.
            p1 = p1.next;
            p2 = p2.next;
        }
        //At last return true if all condition satisfies.
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
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        if(isPalindrome(a)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
       // System.out.println("Not Palindrome: "+isPalindrome(a));
    }
}
