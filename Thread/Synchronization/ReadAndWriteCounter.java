package DSA.Thread.Synchronization;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadAndWriteCounter {
    private int count=0;
    private final ReadWriteLock lock=new ReentrantReadWriteLock();

    //for read lock
    private final Lock readLock=lock.readLock();
    //for writing lock
    private final Lock writeLock=lock.writeLock();

    public void increement(){
        writeLock.lock();
        try{
            count++;
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally{
            writeLock.unlock();
        }
    }
    public int getCount(){
        readLock.lock();
        try{
            return count;
        }finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadAndWriteCounter counter=new ReadAndWriteCounter();
        Runnable readTask=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName() +" read: "+counter.getCount());
                }
            }
        };
        Runnable writeTask=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName() +"incemented");
                }
            }
        };

        Thread writeThread=new Thread(writeTask);
        Thread readThread1=new Thread(readTask);
        Thread readThread2=new Thread(readTask);

        writeThread.start();
        readThread1.start();
        readThread2.start();

        writeThread.join();
        readThread1.join();
        readThread2.join();

        System.out.println("Final count is: "+counter.getCount());
    }
}
