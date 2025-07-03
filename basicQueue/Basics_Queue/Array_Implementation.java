package DSA.basicQueue.Basics_Queue;

public class Array_Implementation {
    public static class queue{
        int front = -1;
        int rear = -1;
        int[] arr = new int[100];
        int size = 0;

        public void add(int val){
            if(rear==arr.length-1){
                System.out.println("Queue is full!");
                return;
            }
            if(front==-1) {
                front=0;
                rear=0;
                arr[0] = val;
            } else{
                arr[++rear] = val;
            }
            size++;
        }

        public int remove() {
            if (size() == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            } else {
                front++;
                size--;
                return arr[front - 1];
            }
        }
        public int peek(){
            if(size() == 0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[front];
        }

        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            for(int i=front; i<=rear; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.display();
        System.out.println(q.size());
        q.add(2);
        q.add(5);
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();
    }
}
