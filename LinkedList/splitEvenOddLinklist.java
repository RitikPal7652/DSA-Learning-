package DSA.LinkedList;

public class splitEvenOddLinklist {
    public static Node splitInPlace(Node head) {
        Node temp = head;

        while (temp != null) {
            if ((temp.data) % 2 != 0) {
                Node odd = temp;
                break;
            }
        }

        temp = head;
        while (temp != null) {
            if ((temp.data) % 2 == 0) {
                Node even = temp;
                break;
            }
        }
        temp = head;
        while (temp != null) {
            if ((temp.data % 2 != 0) && (temp.next.data) % 2 != 0) {
                temp = temp.next;
            } else {
                temp.next = temp.next.next;
            }
        }
        return temp;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node split(Node head){
        Node tempO = new Node(-1); //Just for creating new node for odd.
        Node tempE = new Node(0); //Just for creating new node for even.
        Node temp = head; //This will point on actual list.
        Node o = tempO; //This pointer will point on oddList.
        Node e = tempE; //This pointer will point on evenList.

        while(temp!=null){
            if((temp.data)%2!=0){
                Node od = new Node(temp.data);
                tempO.next = od;
                tempO = tempO.next;
                temp = temp.next;
            }
            else {
                Node ev = new Node(temp.data);
                tempE.next = ev;
                tempE = tempE.next;
                temp = temp.next;
            }
        }

        //This is just for Merge the two lists that are even and odd.
        o = o.next;
        e = e.next;
        tempO.next = e;

        return o;
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(1);
        Node e = new Node(2);
        Node f = new Node(8);
        Node g = new Node(10);
        Node h = new Node(13);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        display(a);
        Node temp = split(a);
        display(temp);
    }
}
