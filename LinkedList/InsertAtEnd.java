package DSA.LinkedList;

public class InsertAtEnd {
    public static void displays(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void insertAtEndTailNotGiven(Node head, int val){
        Node temp = new Node(val);
        Node t = head;

        while(t.next!=null){ //Means the previous element from the null.
            t = t.next;
        }
        t.next = temp;
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static class linklist {
        Node head = null;
        Node tail = null;

        void delete(int idx){
            if(idx==0){
                head = head.next;
                return;
            }
            Node temp = head;
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }
        void insertAtGivenIndex(int idx,int val) {
            Node t = new Node(val);
            Node temp = head; //Only to just point and traverse upto index minus 1.

            if (idx == 0) {
                insertAtBiggining(val);
                return;
            } else if (idx == size()) {
                insertAtEnd(val);
                return;
            } else if (idx > size() || idx < 0) {
                System.out.println("Wrong and Invalid index");
                return;
            }
                for (int i = 1; i < idx; i++) {
                    temp = temp.next;
                }
                    t.next = temp.next;
                    temp.next = t;
        }
        void insertAtBiggining(int val){
            Node temp = new Node(val);

            //First Of all we check node is empty or not.
            if(head==null){
               // head = tail = temp; //We also write inserAtEnd(val);
                insertAtEnd(val); //Bcoz when list is empty whether we place element from starting or from end.
            }
            else{   //If node is not empty.
                temp.next = head;
                head = temp; // head is pointed on temp.
            }
        }

        void insertAtEnd(int val){
            Node temp = new Node(val);

            if(head==null){
                head = temp; //head is pointed to temp.
            }
            else{
                tail.next = temp;
            }
           tail = temp;     //tail is pointed to temp.
        }

        void displays(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            Node temp = head;
            int count=0;
            while(temp!=null){
              count++;
                temp = temp.next;
            }
            return count;
        }

        int get(int idx){
            Node temp = head;
            if(idx<0 || idx>size()){
                System.out.println("Wrong Input");
                return -1;
            }
            for(int i=1; i<=idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        linklist ll = new linklist();
        ll.insertAtGivenIndex(0,5);
        ll.displays();
        ll.insertAtGivenIndex(1,6);
        ll.displays();
        ll.insertAtGivenIndex(2, 7);
        ll.displays();
        ll.insertAtGivenIndex(3, 8);
        ll.displays();
        ll.insertAtGivenIndex(4,9);
        ll.displays();
        ll.insertAtGivenIndex(3,10);
        ll.displays();
        ll.delete(4);
        ll.displays();
//        int x = ll.get(9);
//        System.out.println(x);
//        insertAtEndTailNotGiven(a, 87);
//        displays(a);
    }
}