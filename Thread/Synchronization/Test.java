package DSA.Thread.Synchronization;

public class Test {
    public static void main(String[] args) {
        Counter counter=new Counter();
        MyThread t1=new MyThread(counter);
        MyThread t2=new MyThread(counter);

        /**
         * When multiple threads working on same shared resource it is known as race condition and their timing
         * will be chaos. It can be protected by synchronized keyword/
         *
         * Mutual Exclusion: ensures that kii multiple threads simultanously access naa krle critical section ko.
         *
         * Vo lock lga dete hai apni apni vaari me taaki or koii use naa kr paye use it is known as Locking.
         *To types of locks are there: 1. Intrinsic Lock         2. Explicit Lock
         */
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(Exception e){

        }
        System.out.println(counter.getCount());
    }
}
