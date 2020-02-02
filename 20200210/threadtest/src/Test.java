/**
 * 描述:实现生产者消费者模型
 */
public class Test {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Produces produces = new Produces(warehouse);
        produces.setName("生产者1号");
        produces.start();
        Produces produces1 = new Produces(warehouse);
        produces1.setName("生产者2号");
        produces1.start();

        Courses courses = new Courses(warehouse);
        courses.setName("消费者1号");
        courses.start();
        Courses courses1 = new Courses(warehouse);
        courses1.setName("消费者1号");
        courses1.start();
    }
}
