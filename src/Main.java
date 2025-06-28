import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        Runnable runnable = () -> {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Number: " + i + " from thread: " + Thread.currentThread().getName());
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//
//        Thread thread1 = new Thread(runnable);
//        Thread thread2 = new Thread(runnable);
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();

        ExecutorService executorService = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 10000; i++) {
            int taskNumber = i;
            executorService.submit(() -> {
                System.out.println("Task № " + taskNumber + "run by thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("---");

    }
}