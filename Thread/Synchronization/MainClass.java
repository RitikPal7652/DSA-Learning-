package DSA.Thread.Synchronization;

public class MainClass {
    public static void main(String[] args) {
        Locks lock = new Locks();

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
