package prime;

public class PrimeCheckThread implements Runnable {

    private final long number;
    private final long time_start;

    public PrimeCheckThread(long number) {
        this.time_start = System.currentTimeMillis();
        this.number = number;
    }

    private boolean isPrime(long number) {
        if (number <= 2) {
            return true;
        }
        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        if (isPrime(this.number)) {
            Thread t = new Thread(new LogThread("Primenumber " + this.number + " found in " + (System.currentTimeMillis() - time_start) + "ms"));
            t.start();
        }
    }
}
