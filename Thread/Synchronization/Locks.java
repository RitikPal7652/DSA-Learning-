package DSA.Thread.Synchronization;

//Lock class and mainClass are working on same code.
public class Locks{

   //bank Account
    private int balance=100;
    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() +" attempting to withdrawn "+amount);

        if(balance>=amount){
            System.out.println(Thread.currentThread().getName() +" proceeding with withdrawal ");
            try{
                Thread.sleep(10000);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance-=amount;
            System.out.println(Thread.currentThread().getName() +" completed withdrawn. Remaining balance: "+balance);
        }else{
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }
    }
}
