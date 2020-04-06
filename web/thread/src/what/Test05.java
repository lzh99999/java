package what;

/**
 * 描述:
 */
public class Test05 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {
                        System.out.println();
                    }
                }
            }).start();
        }
    }
}
