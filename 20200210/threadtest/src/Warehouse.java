import java.util.LinkedList;

/**
 * 描述:
 */
public class Warehouse {
    private LinkedList list = new LinkedList();
    public static final int MAX = 100;

    public Warehouse() {
    }

    //存储商品，每次存储10个
    public synchronized void save () {
        while (list.size()>=100) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() +"存储商品前，剩余："+list.size());
        for (int i = 0; i < 10; i++) {
            list.add(new Object());
        }
        System.out.println(Thread.currentThread().getName() +"存储商品后，存储后剩余-------："+list.size());
        this.notifyAll();
    }

    //消费商品，每次消费10个
    public synchronized void sell() {
        while (list.size()<=0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() +"消费商品前，剩余："+list.size());

        for (int i = 0; i < 10; i++) {
            list.removeFirst();
        }
        System.out.println(Thread.currentThread().getName() +"消费商品后，消费后剩余：--------------"+list.size());
        this.notifyAll();
    }
}
