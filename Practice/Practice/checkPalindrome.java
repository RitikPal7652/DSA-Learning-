package DSA.Practice.Practice;

public class checkPalindrome {
    public static boolean isPalindrome(Node head){
        Node tail=head;
        //To find the tail of linked list.
        while(tail.next!=null){
            tail=tail.next;
        }

        while(head!=tail) {
            if(head.val!=tail.val){
                return false;
            }
            head=head.next;
            tail=tail.prev;
        }
        return true;
    }
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);

        Node e = new Node(2);
        Node f = new Node(1);

        // null<-1<-->2<-->3<-->4<-->5->null
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = e;
        e.prev = b;
        e.next = f;
        f.next = null;
        f.prev = e;

        System.out.println(isPalindrome(a));
    }
}
