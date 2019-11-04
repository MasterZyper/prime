package prime;

public class LogThread implements Runnable {

    private final String msg;

    public LogThread(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.println(msg);
    }
}