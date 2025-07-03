package DSA.Thread.Synchronization;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
public class UnFairnessLock {
    public final Lock unfairLock=new ReentrantLock();

    public void accessResource(){
        unfairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" acquired the lock ");
            Thread.sleep(1000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }finally{
            System.out.println(Thread.currentThread().getName()+" released the lock ");
            unfairLock.unlock();
        }
    }

    public static void main(String[] args) {
        UnFairnessLock fairness=new UnFairnessLock();
        //Interface
        Runnable task=new Runnable() {
            @Override
            public void run() {
                fairness.accessResource();
            }
        };
        Thread thread2=new Thread(task,"Thread2");
        Thread thread1=new Thread(task,"Thread1");
        Thread thread3=new Thread(task,"Thread3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
