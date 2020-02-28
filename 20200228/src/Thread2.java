/**
 * 描述:调用thread.interrupt()和Thread.interrupted()方法
 */
public class Thread2 {
    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            // 两种方法均可以
            while (!Thread.interrupted()) {
                // Thread.interrupted()返回true时就中断了线程
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }

        }

        public static void main(String[] args) throws InterruptedException {
            MyRunnable target = new MyRunnable();
            Thread thread = new Thread(target, "1");
            thread.start();
            Thread.sleep(10 * 1000);
            thread.interrupt();//调用thread.interrupt()也可以中断返回true
        }
    }
}