package model.producerconsumermodel;

/**
 * 描述:
 */
public class Main {
    private static volatile int SUM;
    private static volatile int CAPACITY = 100;//库存最大为100

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Producer(), "生产者" + i).start();
        }
        for (int i = 0; i < 20; i++) {
            new Thread(new Consumer(), "消费者" + i).start();
        }
    }

    //静态内部类
    private static class Producer implements Runnable {

        @Override
        public void run() {
            //生产者 每次生产1个东西
            try {
                for (int i = 0; i < 20; i++) {

                    synchronized (Main.class) {
                        while (SUM + 1 > CAPACITY) {
                            Main.class.wait();
                        }
                        SUM++;
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName() + "库存" + SUM);
                        Main.class.notifyAll();
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Consumer implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    synchronized (Main.class) {
                        while (SUM == 0) {
                            Main.class.wait();
                        }
                        SUM--;
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName() + "库存" + SUM);
                        Main.class.notifyAll();
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
