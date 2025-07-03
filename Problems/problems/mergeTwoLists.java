package DSA.Problems.problems;

public class mergeTwoLists {
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

    public static Node merge(Node headA, Node headB){
        Node tempA = headA;
        Node tempB = headB;
        Node head = new Node(-1);
        Node temp = head;

        while(tempA!=null && tempB!=null){
            if(tempA.data< tempB.data){
                temp.next = tempA;
                tempA = tempA.next;
                temp = temp.next;
            }
            else{
                temp.next = tempB;
                tempB = tempB.next;
                temp = temp.next;
            }
        }

        if(tempA==null) temp.next = tempB;
        if(tempB==null) temp.next = tempA;

        return head.next;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        //d.next = e;


        Node e = new Node(2);
        Node f = new Node(4);
        Node g = new Node(7);

        e.next = f;
        f.next = g;

        display(a);
        display(e);
        Node temp = merge(a, e);
        System.out.println("Merge Lists are: ");
        display(temp);
    }
}
