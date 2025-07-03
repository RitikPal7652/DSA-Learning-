package DSA.Problems.problems;

public class splitLinkedList {
    public static void split(Node head){
        Node temp = head;
        Node tempO = new Node(-1);
        Node t1 = tempO;
        Node tempE = new Node(-2);
        Node t2 = tempE;

        while(temp!=null){
            if(temp.data%2!=0){
                t1.next = temp;
                temp = temp.next;
                t1 = t1.next;
            }
            else{
                t2.next = temp;
                temp = temp.next;
                t2 = t2.next;
            }
        }

        tempO = tempO.next;
        tempE = tempE.next;

//        tempO = t1;
//        tempE = t2;

        display(tempO);
        display(tempE);
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        split(a);
    }
}
