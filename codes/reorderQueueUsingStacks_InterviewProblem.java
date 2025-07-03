package DSA.codes;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class reorderQueueUsingStacks_InterviewProblem {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int n = q.size();
        System.out.println(q);

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n/2; i++){
            st.push(q.remove());
        }

        while(st.size()>0){
            q.add(st.pop());
        }

        for(int i=0; i<n/2; i++){
            st.push(q.remove());
        }

        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }

        while (q.size()>0){
            st.push(q.remove());
        }

        while(st.size()>0){
            q.add(st.pop());
        }

        System.out.println(q);
    }
}
