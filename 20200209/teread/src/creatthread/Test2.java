package creatthread;

/**
 * 描述:实现Runnable接口 重写run方法
 */
public class Test2 {
    public static void main(String[] args) {
        Test02 test02 = new Test02();
        Thread t = new Thread(test02);
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main---->"+i);
        }
    }
}
class Test02 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程---->"+i);
        }
    }
}