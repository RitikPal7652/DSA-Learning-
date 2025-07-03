package DSA.LinkedList;

public class displaysrec {

    public static void dispalysByRecursion(Node head){
        if(head==null){ //Base Case/
            return;
        }
        System.out.print(head.data + " "); //Self Work.
        dispalysByRecursion(head.next);    //Recursive Work.

    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        //By connecting all the nodes of lIST.
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        dispalysByRecursion(a);
    }
}
