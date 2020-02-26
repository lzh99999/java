package shengxiao;

/**
 * 描述:
 */
public class Cousters extends Thread{
    CangKu cangKu = new CangKu();

    Cousters(CangKu cangKu){
        this.cangKu = cangKu;
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            cangKu.sell();
        }
    }
}
