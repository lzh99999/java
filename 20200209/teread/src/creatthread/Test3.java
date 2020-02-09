package creatthread;

/**
 * 描述:使用内部类来实现创建线程
 * join() 线程加入/线程等待  可以给定参数来设置等待时间，时间单位为毫秒
 * Thread.yield();线程让步主动放弃cpu的使用权，重新进行系统调度
 */
public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" +i);
                }
            }
        });
        t1.start();
        t1.join();
        Thread.yield();
        for (int i = 0; i <100 ; i++) {
            System.out.println("main --->"+i);
        }
    }
}
