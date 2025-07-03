package DSA.basicQueue.Basics_Queue;

public class LinkedListImplementation_Circular_Queue {
    public static class Node{   //User defined data type.
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
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
                tail.next = head;
            }
            size++;
        }

        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty");
            }
            else{
                int val = head.val;
                head = head.next;
                tail.next = head;
                return val;
            }
        }

        public int peek() throws Exception{
            if(size==0) {
                throw new Exception("Queue is Empty");
            } 
            return head.val;
        }

        public boolean isEmpty(){
            if(size==0) return true;
            else        return false;
        }

        public void display(){
            Node temp = head.next;
            System.out.print(head.val+" ");
            while(temp!=head){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        }
        public static void main(String[] args) throws Exception{
            queue q = new queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.remove();
            System.out.println(q.peek());
            q.display();
    }
}
