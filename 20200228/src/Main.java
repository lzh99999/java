/**
 * 描述:继承Thread类来创建线程类
 */
public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        new Thread(t).start();  // 线程开始运行
    }
}
class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("这里是线程运行的代码");
    }
}
