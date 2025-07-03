package DSA.Thread.Synchronization;

public class MainClass2 {
    public static void main(String[] args) {
        Lock2 lock = new Lock2();

        //Anonymous class
        Runnable task = new Runnable() {
            @Override
            public void run() {
                lock.withdraw(50);
            }
        };
        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
        t2.start();
    }
}
