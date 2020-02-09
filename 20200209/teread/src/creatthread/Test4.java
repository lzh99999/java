package creatthread;

/**
 * 描述:线程中断
 *Thread.currentThread()  返回执行该段代码的线程
 */
public class Test4 {
    public static void main(String[] args) {

    }
    static class T1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() +"--->" +i);
                if (this.isInterrupted()) {
                    return;
                }
            }
        }
    }
}
