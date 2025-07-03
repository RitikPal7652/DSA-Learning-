package DSA.Thread.ThreadPool;

import java.sql.PreparedStatement;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class executorFramework {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
//        Thread[] threads=new Thread[9];
        ExecutorService executor= Executors.newFixedThreadPool(3);
        for (int i = 1; i < 10; i++) {
            int finalI1 = i;
//            threads[i-1] = new Thread(
            executor.submit(    () -> {
                        long result = facotorial(finalI1);
                        System.out.println(result);
                    }
            );
//            threads[i-1].start();
            executor.shutdown();
            try{
                executor.awaitTermination(1, TimeUnit.SECONDS);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }

            System.out.println("Total time: "+(System.currentTimeMillis()-startTime));


        }
//        for(Thread thread: threads){
//            try{
//                thread.join();
//            }catch(InterruptedException e){
//                Thread.currentThread().interrupt();
//            }
//        }
    }

    public static long facotorial(int n) {
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
