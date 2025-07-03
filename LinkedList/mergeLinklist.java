package DSA.LinkedList;

public class mergeLinklist {
    public static Node mergeInplace(Node listA, Node listB){
        Node tempA = listA;
        Node tempB = listB;
        Node head = new Node(100);
        Node temp = head;

        while(tempA!=null && tempB!=null){
           if(tempA.data<tempB.data){
               temp.next = tempA;
               temp = tempA;
               tempA = tempA.next;
           }
           else{
               temp.next = tempB;
               temp = tempB;
               tempB = tempB.next;
           }
        }
        if(tempA==null){
            temp.next = tempB;
        }
        else{
            temp.next = tempA;
        }
        return head.next;
    }
    public static void display(Node a){
        Node temp = a;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void merge(Node a, Node b){
        Node tempA = a;
        Node tempB = b;
        Node head = new Node(100);
        Node temp = head;

        while(tempA!=null && tempB!=null){
            if(tempA.data>tempB.data){
                Node c = new Node(tempB.data);
                temp.next = c;
                temp = c;
                tempB = tempB.next;
            }
            else{
                Node c = new Node(tempA.data);
                temp.next = c;
                temp = c;
                tempA = tempA.next;
            }
        }

        if(tempA==null){
            temp.next = tempB;
        }
        else{
            temp.next = tempA;
        }
       // return head.next;
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node f = new Node(2);
        Node g = new Node(4);
        Node h = new Node(6);
        Node i = new Node(8);
        Node j = new Node(10);

        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;

        merge(a, f);
        display(a);
    }
}
