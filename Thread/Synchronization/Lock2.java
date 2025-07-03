package DSA.Thread.Synchronization;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class Lock2 {

    private int balance = 100;

    //    Reentrant lock is a class that implements lock interface.
    private final Lock lock = new ReentrantLock();
/*
    We use explicit lock here by defining object of Runnanble Interface by ReentrantLock class bcoz we can't make
    object of Interfaces
                lock:try till then lock is not aquire it waits for it
                tryLock(),tryLock(time,time in milli,nano,second): checks that whether lock is free or not
                unlock(): at the end
 */

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
//                        Thread.sleep(3000);
                        Thread.sleep(500);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();//By this i store the state of thread and in future if i will do
            // anything with that i can do but without this i have lost that state.
        }
        if(Thread.currentThread().isInterrupted()){
            //clean up or something like this maintainance
        }
    }
}
