package shengxiao;

import java.util.LinkedList;

/**
 * 描述:
 */
public class CangKu {
    private LinkedList list = new LinkedList();
    private final int MAX = 100;

    public CangKu() {
    }

    //生产者每次生产10个
    public synchronized void save() {
        while (list.size() >=100) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() +"生产前，仓库的数量"+ list.size());
        //存储10个
        for (int i = 0; i < 10; i++) {
            list.add(new Object());
        }
        System.out.println(Thread.currentThread().getName() +"生产后，仓库的数量"+ list.size());
        this.notifyAll();
    }
    //消费者每次消费10个
    public synchronized void sell() {
        while (list.size() <= 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() +"消费前，仓库的数量"+ list.size());
        //消费10个
        for (int i = 0; i < 10; i++) {
            list.removeFirst();
        }
        System.out.println(Thread.currentThread().getName() +"消费后，仓库的数量"+ list.size());
        this.notifyAll();
    }
}
