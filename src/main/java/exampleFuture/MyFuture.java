package exampleFuture;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

public class MyFuture {

    private ExecutorService executorService = Executors.newFixedThreadPool(2);

    private Supplier<Integer> supplier = () -> {
        System.out.println(String.format("---BEFORE run for: %s", Thread.currentThread().getName()));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        }
        System.out.println(String.format("---END run for: %s", Thread.currentThread().getName()));
        return 0;
    };

    public void testFuture() {
        Future f = executorService.submit(() -> supplier);
        executorService.shutdown();
    }



}
