package DSA.basicQueue.Basics_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Basics_Deque {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addLast(4);
        d.addLast(5);
        System.out.println(d);

        d.removeFirst();
        System.out.println(d);

        d.removeLast();
        System.out.println(d);

        d.add(3);   //Add from last like normal queue.
        System.out.println(d);

        d.removeAll(d);
        System.out.println(d);

        d.addFirst(1);
        d.addFirst(2);
        d.addLast(1);
        d.addLast(4);
        d.addLast(2);
        d.addLast(5);
        System.out.println(d);

        d.removeLastOccurrence(1);
        System.out.println(d);

        d.removeFirstOccurrence(2);
        System.out.println(d);

        d.remove();
        System.out.println(d);  //remove from first as normal queue.
        }
    }