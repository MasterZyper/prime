package prime;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        int processors = Runtime.getRuntime().availableProcessors();
        ExecutorService threadPool = Executors.newFixedThreadPool(processors);

        if (args[0] != null) {
            long i = Long.parseLong(args[0]);

            while (true) {
                i = i + 2;
                threadPool.submit(new PrimeCheckThread(i));
            }
        }
    }
}
