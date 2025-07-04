package DSA.DoublyLL;

public class Palindrome {
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
    }

    public static boolean isPalindrome(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        while(head!=temp){
            if(head.val!=temp.val){
                return false;
            }
            head = head.next;
            temp = temp.prev;

        }
        return true;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(2);
        Node e = new Node(1);

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

        System.out.println(isPalindrome(a));
    }
}
