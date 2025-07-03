package DSA.Stacks.Stacks;

public class LinkedListImplementation {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
    public static class Stack{
        private Node head = null;
        private int size = 0;

        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = head.val;
            head = head.next;
            return top;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if(head==null) return true;
            return false;
        }

        void display(){
            Node temp = head;

            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display();
        st.push(6);
        st.display();
        st.pop();
        st.display();
        //System.out.println(st.isEmpty);
    }
}
