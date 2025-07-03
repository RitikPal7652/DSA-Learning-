package DSA.Thread.Synchronization;

//counter class mythread class and test class all are work on same code
class Counter {
    private int count=0;

    public void increement(){//It can be solved by using synchronized keyword.
        synchronized (this){
            count++;
        }

    }
    public int getCount(){
        return count;
    }
}
