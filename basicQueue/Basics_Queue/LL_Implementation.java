package DSA.basicQueue.Basics_Queue;

public class LL_Implementation {
    public static class Node {  //User defined data type.
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
    public static class queue{
        Node head = null;
        Node tail = null;
        int size=0;

        public void add(int val){
            Node temp = new Node(val);
            if(size==0){
                head = temp;
                tail = temp;
            } else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            int x = head.val;
            /*Bcoz if we do head.next 1st then it will remove
            or we can't access it.
             */
            head = head.next;
            size--;
            return x;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.val;
        }

        public boolean isEmpty(){
            if(size==0) return true;
            else        return false;
        }

        public void isFull(){
            if(size==0){
                System.out.print("Queue is Full!");
                return;
            }
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp =temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue q1 = new queue();
        System.out.println(q1.isEmpty());
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println(q1.isEmpty());
        q1.display();
        System.out.println(q1.remove());
        System.out.println(q1.peek());
        System.out.println(q1.remove());
        q1.display();
        System.out.println(q1.size);    //As a attribute
    }
}
