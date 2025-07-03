package DSA.basicQueue.Basics_Queue;

public class Doubly_LinkedList_Implementation_Deque {
    public static class Node {   //User defined data type.
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static class deque {  //User defined data structure.
        Node head = null;
        Node tail = null;
        int size = 0;

        public void addFirst(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head.prev = temp;
                head = temp;
                head.prev = null;
            }
            size++;
        }

        public void addLast(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
                temp.next = null;
            }
            size++;
        }

        public void removeFirst() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }
            System.out.println();
        }

        public void removeLast() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            }
            tail = tail.prev;
            tail.next = null;
            size--;

            System.out.println();
        }

        public int getFront() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            }
            return head.val;
        }

        public int getRear() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            }
            return tail.val;
        }

        public void display() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            } else {
                Node temp = head;
                while (temp != tail) {
                    System.out.print(temp.val + " ");
                    temp = temp.next;
                }
                System.out.print(temp.val);
            }
        }

        public static void main(String[] args) throws Exception {
            deque dq = new deque();
            dq.addFirst(1);
            dq.addFirst(2);
            dq.addLast(4);
            dq.display();
            System.out.println();
//            dq.deleteFront();
//            dq.display();
//            dq.deleteRear();
//            dq.display();
            System.out.println(dq.getFront());
            System.out.println(dq.getRear());
        }
    }
}
