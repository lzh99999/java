public class SynchronizedDemo {
    public void methond() {
        // 进入代码块会锁 this 指向对象中的锁；
        // 出代码块会释放 this 指向的对象中的锁
        synchronized (this) {
        }
    }

    public static void main(String[] args) {
        SynchronizedDemo demo = new SynchronizedDemo();
        demo.methond();
    }
}