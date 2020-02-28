/**
 * 描述:调用Thread.currentThread().isInterrupted()标志位不会清除
 */
public class ThreadDem {
    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().isInterrupted());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable target = new MyRunnable();
        Thread thread = new Thread(target, "1");
        thread.start();
        thread.interrupt();
    }
}