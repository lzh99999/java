package shengxiao;

/**
 * 描述:
 */
public class Test {
    public static void main(String[] args) {
        CangKu cangKu = new CangKu();
        Produces produces = new Produces(cangKu);
        produces.setName("生产者1号");
        produces.start();
        Produces produces1 = new Produces(cangKu);
        produces1.setName("生产者2号");
        produces1.start();

        Cousters cousters = new Cousters(cangKu);
        cousters.setName("消费者1号");
        cousters.start();
        Cousters cousters2 = new Cousters(cangKu);
        cousters2.setName("消费者2号");
        cousters2.start();
    }
}
