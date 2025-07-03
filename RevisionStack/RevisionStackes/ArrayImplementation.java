package DSA.RevisionStack.RevisionStackes;

public class ArrayImplementation {
    public static class Stack{
        private int[] arr = new int[50];
        private int idx=0;

        void push(int x){
            if(isFull()) {
                System.out.println("|||Stack is Full|||");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("|||Stack is Empty|||");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("|||Stack is Empty|||");
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        boolean isFull(){
            if(idx==arr.length){
                System.out.println("|||Stack is Full|||");
                return true;
            }
            else {
                return false;
            }
        }
        boolean isEmpty(){
            if(idx==0){
                System.out.println("|||Stack is Empty|||");
                return true;
            }
            else{
                return false;
            }
        }
        int size(){
            return idx;
        }
        void display() {
            for(int i=0; i<=idx-1; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();

        System.out.println(st.isFull());
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

    }
}
