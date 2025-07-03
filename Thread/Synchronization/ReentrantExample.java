package DSA.Thread.Synchronization;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    private final Lock lock=new ReentrantLock();

    public void outerMethod(){
            lock.lock();
            try{
                System.out.println("Outer method");
                innerMethod();
            }finally {
                lock.unlock();
            }
    }
    /**Dead Lock: When both are dependent on each other for unlocking.
     * Till the time innerMethod did'nt complete outerMethod will not move ahead and till the time outerMethod lock
     * is not unlocked innerMethod will not move ahead means both are dependent on each other.
     *
     * One lock can't acquire lock multiple times but due to reentrant lock class it can. A count will be initialized
     * at the time of reentrant lock class is defined and this count will calculate the acquiring the lock times.
     * count=2 in this case bcoz lock is acquire two times here.
     *
     * Each lock is pair with its unlock
     */
    public void innerMethod(){
//        lock.lockInterruptibly();//For interrupt the lock after a given period of time
        lock.lock();
        try{
            System.out.println("Inner Method");
        }finally {
            lock.unlock();
        }
    }
//    Dead lock prevention by reEntrant lock

    public static void main(String[] args) {
        ReentrantExample example=new ReentrantExample();
        example.outerMethod();
    }
}
