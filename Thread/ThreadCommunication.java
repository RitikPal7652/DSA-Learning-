package DSA.Thread;

class sharedResources{
    private int data;
    private boolean hasData;

    /**
     * Thread communication : In a multithreaded environment , threads often need to
     * communicate and coordinate with each other to accomplish a task.
     *
     * Without proper communication mechanisms, thread might end up in inefficient
     * busy waiting states ,leading to wastage of CPU resources and potential deadlocks.
     *
     *
     * wait()
     * notify()
     * notifyAll()
     * These all are always work in synchronized function
     * @param value
     */
    public synchronized void produce(int value){
        while(hasData){
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        data=value;
        System.out.println("Produced: "+value);
        hasData=true;//means to tell to consumer consume the value
        notify();//do consume
    }
    public synchronized int consume(){
        while(!hasData){
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        hasData=false;//means to tell producer that produce the data.Data is empty now
        System.out.println("Consumed value "+data);
        notify();//to producer that has data is false now
        return data;
    }
}
class Producer implements Runnable{
    private sharedResources resources;

    public Producer(sharedResources resources){
        this.resources=resources;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            resources.produce(i);
        }
    }
}
class Consumer implements Runnable{
    private sharedResources resources;

    public Consumer(sharedResources resources){
        this.resources=resources;
    }

   @Override
    public void run(){
        for(int i=0;i<10;i++){
            int value=resources.consume();
        }
   }
}
public class ThreadCommunication {
    public static void main(String[] args) {
        sharedResources resource=new sharedResources();
        Thread producerThread=new Thread(new Producer(resource));//directly pass class of producer and consumer.
        Thread consumerThread=new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}
