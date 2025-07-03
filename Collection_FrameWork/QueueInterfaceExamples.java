package DSA.Collection_FrameWork;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueInterfaceExamples {
    static void queueExample(){
        LinkedList<Integer> l = new LinkedList<>();
        l.offer(1);
        l.offer(2);
        l.offer(3);
        System.out.println(l);
        System.out.println(l.peek());
        System.out.println(l.pop());
        System.out.println(l.isEmpty());
        System.out.println(l.size());
        System.out.println();
    }

    static void priorityQueueExamples(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10); //by default minimum priority it will consider.
        pq.add(5);
        pq.add(7);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }

    static void DequeExamples(){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.addLast(4);
        dq.addFirst(3);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);
    }
    public static void main(String[] args) {
        //queueExample();
        //priorityQueueExamples();
        DequeExamples();
    }
}
