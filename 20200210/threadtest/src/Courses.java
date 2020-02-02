/**
 * 描述:生产者类
 */
public class Courses extends Thread{
    Warehouse warehouse = new Warehouse();

    public Courses(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            warehouse.sell();
        }
    }
}
