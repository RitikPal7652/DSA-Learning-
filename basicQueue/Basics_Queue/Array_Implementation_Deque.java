package DSA.basicQueue.Basics_Queue;

public class Array_Implementation_Deque {
    public static class deque{
        private int front = -1;
        private int rear = -1;
        private int[] arr = new int[5];
        private int size=0;
        private int n = arr.length;

        public void insertAtFront(int val){
            if((front==0 && rear==n-1) || front==rear+1){
                System.out.println("Queue is Full!");
                return;
            }
            else if(front==-1 && rear==-1){
                front = rear = 0;
                arr[front] = val;
            }
            else if(front==0){
                front = n-1;
                arr[front] = val;
            }
            else{
                front--;
                arr[front] = val;
            }
            size++;
        }

        public void insertAtRear(int val){
          if((front==0 && rear==n-1) || front==rear+1){
              System.out.println("Queue is Full!");
              return;
          }
          else if(front==-1 && rear==-1){
              front=rear=0;
              arr[rear] = val;
          }
          else if(rear==n-1){
              rear=0;
              arr[rear] = val;
          }
          else{
              rear++;
              arr[rear] = val;
          }
          size++;
        }

        public void deleteAtFront(){
            if(front==-1 && rear==-1){
                System.out.println("Queue is Empty!");
                return;
            }
            else if(front==rear){
                front = rear = -1;
            }
            else if(front==n-1){
                front = 0;
            }
            else{
                front++;
            }
            size--;
        }

        public void deleteAtRear(){
            if(front==-1 && rear==-1){
                System.out.println("Queue is Empty!");
            }
            else if(front==rear){
                front = rear = -1;
            }
            else if(rear==0){
                rear = n-1;
            }
            else{
                rear--;
            }
            size--;
        }

        public int getFront(){
            if(front==-1 && rear==-1){
                System.out.println("Queue is Empty!");
            }
            return arr[front];
        }

        public int getRear() {
            if (front == -1 && rear == -1) {
                System.out.println("Queue is Empty!");
            }
            return arr[rear];
        }

        public void display(){
            int i = front;
            while(i!=rear){
                System.out.print(arr[i] + " ");
                i = (i+1)%n;
            }
            System.out.println(arr[rear]);
        }
    }
    public static void main(String[] args) {
        deque q = new deque();
        q.insertAtFront(1);
        q.insertAtFront(2);
        q.insertAtRear(6);
        q.insertAtRear(8);
        q.display();
        q.deleteAtFront();
        q.display();
        q.deleteAtRear();
        q.display();
        System.out.println(q.getFront());
        System.out.println(q.getRear());
    }
}
