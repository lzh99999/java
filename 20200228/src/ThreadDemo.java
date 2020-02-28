/**
 * 描述:标记法中断线程
 */
public class ThreadDemo {
    private static class MyRunnable implements Runnable {
        public volatile boolean isQuit = false;

        @Override
        public void run() {
            while (!isQuit) {
                //当标记为true时就中断了线程
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable target = new MyRunnable();
        Thread thread = new Thread(target, "1");
        thread.start();
        Thread.sleep(10 * 1000);
        target.isQuit = true;//让标记成为true
    }
}