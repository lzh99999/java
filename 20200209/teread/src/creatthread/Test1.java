package creatthread;

/**
 * 描述:继承Thread类来创建线程
 * 然后重写run()方法
 */
public class Test1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println("main--->" + i);
        }
    }
}

class Test extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程---->" + i);
        }
    }
}
