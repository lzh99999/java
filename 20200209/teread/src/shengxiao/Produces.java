package shengxiao;

/**
 * 描述:
 */
public class Produces extends Thread{
    CangKu cangKu = new CangKu();

    Produces(CangKu cangKu){
        this.cangKu = cangKu;
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            cangKu.save();
        }
    }
}
