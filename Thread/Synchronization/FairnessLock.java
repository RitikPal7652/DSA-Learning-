package DSA.Thread.Synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Order determines : Fairness will happen
public class FairnessLock {
    public final Lock fairLock = new ReentrantLock(true);

    public void accessResource() {
        fairLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock ");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock ");
            fairLock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessLock fairness = new FairnessLock();
        //Interface
        Runnable task = new Runnable() {
            @Override
            public void run() {
                fairness.accessResource();
            }
        };
        Thread thread2 = new Thread(task, "Thread2");
        Thread thread1 = new Thread(task, "Thread1");
        Thread thread3 = new Thread(task, "Thread3");

        try{
            thread1.start();
            Thread.sleep(50);
            thread2.start();
            Thread.sleep(50);
            thread3.start();
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }
//  By above expression work is totally done line by line
//        Now work is totally fair inside system. Assigning is dependent on OS scheduling
    }
}
