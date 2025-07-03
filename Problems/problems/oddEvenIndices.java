package DSA.Problems.problems;

public class oddEvenIndices {
    public static void display(Node head){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node oddEvenIndex(Node head){
        Node tempO = new Node(-1);
        Node tempE = new Node(-2);
        Node temp = head;

        Node t1 = tempO;
        Node t2 = tempE;

        while(temp!=null){
                t1.next = temp;
                temp = temp.next;
                t1 = t1.next;

                t2.next = temp;
                if(temp==null) break;
                temp = temp.next;
                t2 = t2.next;

        }

        tempO = tempO.next;
        tempE = tempE.next;

        t1.next = tempE;

        return head;
    }
    public static class Node{
        int val;
        Node next;

        Node(int val){ this.val = val; }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Original List");
        display(a);
        Node temp = oddEvenIndex(a);
        System.out.println("Odd-Even Indexed List");
        display(temp);
    }
}
