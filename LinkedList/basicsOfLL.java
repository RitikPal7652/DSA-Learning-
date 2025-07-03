package DSA.LinkedList;

public class basicsOfLL {
    public static class Node{
        int data;   //It stores the data of current node.
        Node next; //It stores the address of next node.

        Node(int data){
            this.data = data; //It will store the data that we pass through constructor call.
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(7);
        Node e = new Node(9);

        a.next = b; //This is how we connect the two nodes. Now in a node the address of b is stored.
        b.next = c; //Address of c is stored in b node.
        c.next = d; //Address of d is stored in c node.
        d.next = e; //Address of e is stored in d node.
        //At last node always null address is filled in place of address of next node.
        System.out.println(a.data);//Means actual data present at ath node.
        System.out.println(b);      //Means address of b.
        System.out.println(a.next); //Means address of b.
        System.out.println(a.next.next);//Means address of c which is present in dth node.
        System.out.println(b.data);
        System.out.println(b.next);

        System.out.println(c.data);
        System.out.println(c.next);

        System.out.println(d.data);
        System.out.println(d.next);

        System.out.println(e.data);
        System.out.println(e.next);
    }
}
