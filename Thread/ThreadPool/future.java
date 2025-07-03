package DSA.Thread.ThreadPool;

import java.util.concurrent.*;

/**
 * If we want to return something then use callable
 * If we don't want to return something then use runnable
 * Even though callable does not return anything but submit will return with the help of future.
 */
public class future {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
//        Future<Integer> future=executorService.submit(()->42);
//        Future<?> future=executorService.submit(()-> System.out.println("Hello"));
//       Runnable runnable=()->"Hello";
        Callable<String> callable=()->"hello";
//        Future<String> future=executorService.submit(()->"hello");
        Future<String> future=executorService.submit(callable);
        System.out.println(future.get());//waits for the result and then retrieves it.

//        if(future.isDone()){
//            System.out.println("Task is done!");
//        }
        executorService.shutdown();
    }
}
