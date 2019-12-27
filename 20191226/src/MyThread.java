/**
 * Created with IntelliJ IDEA.
 * Description:线程的两种定义：方法和常用方法的使用
 */
public class MyThread {
    private static class MyThread1 extends Thread{
        @Override
        public void run() {
            //打印线程名称
            System.out.println(MyThread1.currentThread().getName());
            try {
                Thread.sleep(3333);
            } catch (InterruptedException e) {
                System.out.println("ass");
                e.printStackTrace();
            }
        }
    }

    private static class MyThread2 extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                System.out.println("isInter");
                try {
                    Thread.sleep(121);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("111");
        }
    }

    private static class MyThread3 implements Runnable {
        @Override
        public void run() {
            //检测是否中断 类名来引用会修改
            while (!Thread.interrupted()) {
                System.out.println("Thread类");
            }
        }
    }
    public static void main(String[] args) {
       /* MyThread1 t1 = new MyThread1();
        t1.start();
        t1.interrupt();*/
        /*MyThread2 t2 = new MyThread2();
        t2.start();
        System.out.println("Sss");
        t2.interrupt();*/
        Thread t3 = new Thread(new MyThread3());
        t3.start();
        }
}
