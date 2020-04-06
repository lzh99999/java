package model.blocking_queue;


/**
 * 描述:
 */
public class BlockingQueue<E> {
    private Object[] queue = null;
    private int putIndex;//放入元素的位置
    private int takeIndex;//弹出元素的位置
    private int size;//有效元素个数

    public BlockingQueue(int capacity) {
        queue = new Object[capacity];
    }

    public synchronized void put(E e) {
        try {
            while (size == queue.length) {
                wait();
            }
            queue[(putIndex + 1) % queue.length] = e;
            putIndex++;
            size++;
            notifyAll();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    public synchronized E take() {
        try {
            while (size == 0) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        size--;
        takeIndex = (takeIndex + 1) % queue.length;
        notifyAll();
        return (E) queue[takeIndex];
    }

    public static void main(String[] args) {
        BlockingQueue<Integer> bq = new BlockingQueue<>(10);
        for (int i = 0; i < 5; i++) {
            final int k = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                        for (int j = 0; j < 100; j++) {
                            bq.put(k * 100 + j);
                        }
                    }
            }).start();
        }
        while (true) {
            int take = bq.take();
            System.out.println(take);
        }
    }
}
