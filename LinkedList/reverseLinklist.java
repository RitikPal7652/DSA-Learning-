package DSA.LinkedList;

public class reverseLinklist {
    public static void displayByRec(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.val + " ");
        displayByRec(head.next);
    }
    public static void display(Node head){
        Node temp = head;

        while(head!=null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static Node reverse2(Node head){
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
    public static Node reverse(Node head){
        /*
        Time Complexity : O(n).
        Space Complexity : O(n). Extra space is used in call stack.
         */
        //Solve it by recursion.
        if(head.next==null){
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
            Node a = new Node(3);
            Node b = new Node(2);
            Node c = new Node(1);
            Node d = new Node(8);
            Node e = new Node(9);
            Node f = new Node(10);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            display(a);
            //a = reverse(a);
            a = reverse2(a);
            display(a);
    }
}
