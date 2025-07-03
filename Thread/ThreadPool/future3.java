package DSA.Thread.ThreadPool;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
public class future3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> callable1 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 1");
            return 1;
        };
        Callable<Integer> callable2 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 2;
        };
        Callable<Integer> callable3 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 3;
        };

        //Converting arrays into list
        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

        //invokeAll(list) takes collection of class and execute together.
        /*
        List<Future<Integer>> futures = null;
        try {
            futures = executorService.invokeAny(list, 1, TimeUnit.SECONDS);
//            futures = executorService.invokeAll(list, 1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         */
        try {
            Integer i=executorService.invokeAny(list);
            System.out.println(i);
//            executorService.invokeAny(list);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        /**
         * This invokeAll() methods blocks the main thread and waits for till
         * all the execution is not complete.
         */

       /* for (Future<Integer> f : futures) {
            try {
                System.out.println(f.get());
            } catch (CancellationException | InterruptedException | ExecutionException e) {

            }
        */
            executorService.shutdown();
            System.out.println("Hello world"); //It prints at last when all works complete
        }
    }

