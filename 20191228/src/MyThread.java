
/**
 * Created with IntelliJ IDEA.
 * Description:
 */
class Test implements Runnable{

    @Override
    public void run() {
        int i = 0;
      while (!Thread.currentThread().isInterrupted()) {
          try {
              Thread.sleep(200);
          } catch (InterruptedException e) {
              System.out.println("异常！");
              return;
          }
          System.out.println(Thread.currentThread().getName() + " i = " + i++);
      }
    }
}
public class MyThread {
    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        Thread thread = new Thread(test,"a");
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
        System.out.println("程序结束！");
    }
}
