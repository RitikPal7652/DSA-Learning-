package DSA.LinkedList;

public class lengthLl {
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static class Node{
        int data;
        Node next;

        Node(int data){ //Constructor
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(10);
        //By connecting all the nodes of lIST.
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println("Length of LinklIST IS: "+length(a));
    }
}
