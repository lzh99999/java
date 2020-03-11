package what;

/**
 * 描述:
 */

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
        System.out.println();
    }
}
