package DSA.Thread;

//public class creatingThread extends Thread{
public class creatingThread implements Runnable{
    @Override
    public void run(){
        for(int i=0;;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
