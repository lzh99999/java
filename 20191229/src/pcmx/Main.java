package pcmx;



/**
 * Created with IntelliJ IDEA.
 * Description:
 */
class Goods {
    private int count;
    private String name;

    public synchronized void set(String name) {
        this.name = name;
        while (count == 1) {
            System.out.println(Thread.currentThread().getName()+"有货等待消费");
            try {
                System.out.println(Thread.currentThread().getName()+"正在等待");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.println(Thread.currentThread().getName()+" "+toString());
        this.notifyAll();
    }
    public synchronized void get() {
        while (count == 0) {
            System.out.println(Thread.currentThread().getName()+"无货等待进货");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        System.out.println(Thread.currentThread().getName()+" "+toString());
        this.notifyAll();
    }
    @Override
    public String toString() {
        return "Product{" +
                "count=" + count +
                ", name='" + name + '\'' +
                '}';
    }
}

class Product implements Runnable{
    private Goods goods;

    public Product(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true){
            this.goods.set("水");
        }
    }
}

class Consumer implements Runnable{
    private Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true) {
            this.goods.get();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Product product = new Product(goods);
        Consumer consumer = new Consumer(goods);
        Thread threadP1 = new Thread(product,"p1");
        Thread threadP2 = new Thread(product,"p2");
        Thread threadP3 = new Thread(product,"p3");
        Thread threadP4 = new Thread(product,"p4");
        Thread threadC1 = new Thread(consumer,"c1");
        Thread threadC2 = new Thread(consumer,"c2");
        Thread threadC3 = new Thread(consumer,"c3");
        threadC1.start();
        threadC2.start();
        threadC3.start();
        threadP1.start();
        threadP2.start();
        threadP3.start();
        threadP4.start();

    }
}
