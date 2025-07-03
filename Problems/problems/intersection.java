package DSA.Problems.problems;

public class intersection {
   public static int intersectionList(Node headA, Node headB){
       Node tempA = headA;
       Node tempB = headB;

       int lengthA=0;
       int lengthB=0;

       //To find the length of First list.
       while(tempA!=null){
           lengthA++;
           tempA = tempA.next;
       }

       //To find the length of second list.
       while(tempB!=null){
           lengthB++;
           tempB = tempB.next;
       }

       //Again pointed on head bcoz both the pointer now pointed on null on their respective lists.
       tempA = headA;
       tempB = headB;

       if(lengthA>lengthB){
           int steps = lengthA-lengthB;
           for(int i=1; i<=steps; i++){
               tempA = tempA.next;
           }
       }
       else{
           int steps = lengthB-lengthA;
           for(int i=1; i<=steps; i++){
               tempB = tempB.next;
           }
       }

       while(tempA!=tempB){
           tempA = tempA.next;
           tempB = tempB.next;

           /*
           If we have not found any Node in which tempA is equal to tempB and our list is end means now
           there is no Node which we find so we return -1.
            */
           if(tempA==null || tempB==null){
               return -1;
           }
       }
       if(tempA==tempB){
           return tempA.data;
       }
       return -1;
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

            Node g = new Node(10);
            Node h = new Node(20);

            g.next = h;
            h.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            int temp = intersectionList(a, g);
            System.out.println("Intersection of two lists are: "+temp);
   }
}
