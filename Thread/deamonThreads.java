package DSA.Thread;

class deamonThreads extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Hello World!");
        }
    }
    public static void main(String[] args) {
        deamonThreads myThread=new deamonThreads();
        myThread.setDaemon(true);
        myThread.start();//runnable
        System.out.println("Main done");
        //myThread is user thread and jvm waits for that till its execution is not done.
        //But JVM not waits for daemon thread it is not important person for JVM.
        //Daemon threads are run in background
        /*
        Agar baaki ke threads band ho gye hai JESE ki main threads to vo JVM dekhega apna
        myThread to deamon hai maaro goli bnd ho jao.

        Agar baaki ke threads bnd ho gye hai to mai bhi bnd ho jaata hu
         */

    }
}
