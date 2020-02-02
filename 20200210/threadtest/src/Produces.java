/**
 * 描述:生产者类
 */
public class Produces extends Thread{
    Warehouse warehouse = new Warehouse();

    public Produces(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            warehouse.save();
        }
    }
}
