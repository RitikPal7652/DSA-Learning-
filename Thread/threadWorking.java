package DSA.Thread;

public class threadWorking {
    public static void main(String[] args) {
//       1st method to create thread
//        creatingThread name=new creatingThread();
//        name.start();
//      2 threads working simultaneously.

        //2nd method to create thread
        creatingThread second=new creatingThread();//thread instance/object
        Thread t1=new Thread(second);//thread instance and pass newlyThread in it as argument.
        t1.start();

        for(int i=0;;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public void start() {
    }
}
