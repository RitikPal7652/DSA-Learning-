package DSA.Thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.*;
public class execution {
    public static void main(String[] args) throws ExecutionException,InterruptedException{
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Future<Integer> submit=executorService.submit(()->1+2);
        Integer i=submit.get();

        System.out.println("Sum is : "+i);
        executorService.shutdown();
//        System.out.println();
        System.out.println(executorService.isShutdown());
        Thread.sleep(1);//ruko jara sabr kro
        System.out.println(executorService.isTerminated());
        /**
         * Returns true if all tasks have completed following shut down.
         * Note that isTerminated is never true unless either shutdown
         * or shutdownNow was called first.
         */
    }
}
