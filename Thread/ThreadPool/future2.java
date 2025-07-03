package DSA.Thread.ThreadPool;
import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class future2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> future=executorService.submit(()-> System.out.println("hello"));
        future.get();
        executorService.shutdown();
    }
}
