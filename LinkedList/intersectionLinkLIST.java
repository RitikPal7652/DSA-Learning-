package DSA.LinkedList;

public class intersectionLinkLIST {
    public static Node intersectTwoNode(Node a, Node a1){
        Node tempA = a; //Points on a.
        Node tempB = a1; //Points on a1.

        //To find the length of first Node.
        int lengthA = 0;
            while(tempA!=null){
                lengthA++;
                tempA = tempA.next;
        }

        //To find the length of Second Node.
        int lengthB = 0;
            while(tempB!=null){
                lengthB++;
                tempB = tempB.next;
            }

            //As both temp points on null. So again, it points on head point.
            tempA = a;
            tempB = a1;
            if(lengthA>lengthB){
                int steps = lengthA-lengthB;
                //  So that both node became equal in size.
                for(int i=1; i<=steps; i++){
                    tempA = tempA.next;
                }
            }
            else{
                int steps = lengthB-lengthA;
                //  So that both node became equal in size.
                for(int i=1; i<=steps; i++){
                    tempB = tempB.next;
                }
            }

            //If at any point both temp will become equal that means they are intersect at that point.
            while(tempA!=tempB){
                tempA = tempA.next;
                tempB = tempB.next;
            }

            return tempA;
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(40);
        Node b = new Node(50);
        Node c = new Node(60);
        Node d = new Node(70);
        Node e = new Node(80);
        Node f = new Node(90);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        //Second LinkList starts from different element but after then it intersects in given List.
        Node a1 = new Node(7);
        Node b1 = new Node(10);

        a1.next = b1;
        b1.next = d;

        Node intersect = intersectTwoNode(a, a1);
        System.out.println("Both Node Intersects at: "+(intersect.data));
    }
}
