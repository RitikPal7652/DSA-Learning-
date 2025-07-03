package DSA.Thread;

public class threadMethod extends Thread{
    public threadMethod(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" is running");
            Thread.yield();
        }
    }
//    public void run(){        for interruption: t1.interrupt()
//        try{
//            Thread.sleep(1000);
//            System.out.println("Thread is running");
//        }catch(InterruptedException e){
//            System.out.println("Thread interrupted: "+e);
//        }
//    }

//    public void run(){    //For setPriority
//        for(int i=1;i<=5;i++){
//            try{
//                Thread.sleep(1000);
//            }catch(InterruptedException e){
//                throw new RuntimeException(e);
//            }
//            System.out.println(Thread.currentThread().getName()+" -Priority: "+Thread.currentThread().getPriority()+" -count: "+i);
//        }
//    }

    public static void main(String[] args) throws InterruptedException {
        //We can set the priority between one or more constructors.
        threadMethod t1=new threadMethod("A");
        threadMethod t2=new threadMethod("B");
//        threadMethod t3=new threadMethod("C");

        t1.start();
        t2.start();
//        t3.start();

        //t1.join()

//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t3.setPriority(Thread.NORM_PRIORITY);

        t1.interrupt();//Output: Thread interrupted: java.lang.InterruptedException: sleep interrupted

    }
}
