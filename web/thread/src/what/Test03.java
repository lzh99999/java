package what;

/**
 * 描述:
 */
public class Test03 {
    private static int num = 0;
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        num++;
                    }
                }
            }).start();
        }
        while (Thread.activeCount() >1) {
            Thread.yield();
        }
        System.out.println(num);
    }
}
