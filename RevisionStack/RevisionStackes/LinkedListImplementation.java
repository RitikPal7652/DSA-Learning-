package DSA.RevisionStack.RevisionStackes;

public class LinkedListImplementation {
    public static class Node{   //User defined data type.
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
    public static class LLstack{  //User defined data structure.
        private Node head = null;
        private int size=0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int peek() {  return head.val;  }
        int pop(){
            int x = head.val;
            head =head.next;
            return x;
        }
        void display(){
            /*
            We do not make this function as display function because
            we need to paas some parameters inside it but we don't want
            that we pass parameters inside it. So we make some other
            function inside the display function and we pass some paramters
            in that function. Need to pass parameters inside the function is
            due to recursive function in nature.
             */
            displayStraight(head);
            System.out.println();
        }
        void displayStraight(Node h){
            if(h==null) return;
            displayStraight(h.next);
            System.out.print(h.val+" ");

        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size()==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        LLstack st = new LLstack();

        System.out.println(st.isEmpty());
        st.push(4);
        st.display();
        st.push(6);
        st.display();
        st.push(8);
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        st.display();
        st.push(10);
        st.display();
        st.push(12);
        System.out.println(st.size());
        st.display();
        st.pop();
        st.display();
        st.push(15);
        System.out.println(st.size());
        st.display();

    }
}
