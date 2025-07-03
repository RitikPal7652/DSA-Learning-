package DSA.StackProblem.StackProblem;

import java.util.Stack;

public class ArrayImplementation {
    public static class Stack{
        /*
          hmne ye private isliye hai taai kisi ko bhi pta naa chle ki ye implementation hum array se krr
          rhe hai. Isse hmari time and space complexity me firk pdta hai thoda boht.

          Isse user ko to lgega ki vo stack ke sath kaam krr rha hai but use kya pta yha to kaam hi array
          se ho rha hai.
         */
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int val){ //It adds the element at the top.
            if(isFull()){
                System.out.println("Stack is Full!");
                return;
            }
            arr[idx] = val;
            idx++;
        }

        int peek(){ //It is accesible to top element.
            if(idx==0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return arr[idx-1];
        }

        int pop(){ //It removes the top element but it access the top element also.
            if(idx==0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }

        boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            return false;
        }

        int capacity(){ //Actual array ki length kitni hai isse ye pta chlta hai.
            return arr.length;
        }
        void display( ){
            for(int i=0; i<idx; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size(){ //It will give the size of Stack.
            return idx;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack(); //This is a object of class Stack.
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
        st.push(1);
        //System.out.println(st.size());
        st.display();
        st.push(2);
        //System.out.println(st.size());
        st.display();
        st.push(3);
        //System.out.println(st.size());
        st.display();
        st.push(4);
        //System.out.println(st.size());
        st.display();
        st.push(5);

        st.display();

        st.pop();
        st.display();
        System.out.println(st.size());

        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
    }
}
