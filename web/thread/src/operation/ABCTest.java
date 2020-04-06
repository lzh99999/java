package operation;

/**
 * 描述:
 */
public class ABCTest {
    private static int index = 0;

    private static void print(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            final int k = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int j = 0; j < 10; j++) {
                            synchronized (ABCTest.class) {
                                while (index % strs.length != k) {
                                    ABCTest.class.wait();
                                }
                                index++;
                                System.out.print(strs[k]);
                                if (k == strs.length-1) {
                                    System.out.println();
                                }
                                ABCTest.class.notifyAll();
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
    public static void main(String[] args) {
        print(new String[]{"a","b","c"});
    }
}
