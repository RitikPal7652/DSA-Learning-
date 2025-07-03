package DSA.Thread;

class statesOfThread extends Thread{
    @Override
    public void run(){
        System.out.println("Running");

        try{
        Thread.sleep(2000);//t1 is at sleeping condition.
            System.out.println();
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) throws InterruptedException{
        statesOfThread t1=new statesOfThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);//main method to sleep and go to run method above class.
        System.out.println(t1.getState());
        t1.join();//wait for t1 to come
        System.out.println(t1.getState());//terminating condition.

    }
}

