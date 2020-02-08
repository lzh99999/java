/**
 * 描述:泊松分酒   穷举法
 */
public class BackBottle {
    static int b1 = 12;//瓶子1
    static int b2 = 9;//瓶子2
    static int b3 = 4;//瓶子3
    static int m = 8;//要得到的结果

    public static void main(String[] args) {
        backBottle(12, 0, 0);
    }

    private static void backBottle(int bb1, int bb2, int bb3) {
        System.out.println("bb1: " + bb1 + " bb2: " + bb2 + " bb3: " + bb3);
        if (bb1 == m || bb2 == m || bb3 == m) {
            System.out.println("可以得到酒：" + m);
            return;
        }
        //b1向b2中倒酒
        if (bb2 != b2 && bb1 != 0) {
            //b2酒满
            if (bb2 + bb1 >= b2) {
                backBottle(bb1 - (b2 - bb2), b2, bb3);
            } else {
                backBottle(0, bb2 + bb1, bb3);
            }
            //b2向b3倒酒
        } else if (bb3 != b3 && bb2 != 0) {
            if (bb3 + bb2 >= b3) {
                backBottle(bb1, bb2 - (b3 - bb3), b3);
            } else {
                backBottle(bb1, 0, bb2);
            }
        } else if (bb1 != b1 && bb3 != 0) {
            if (bb3 + bb1 >= b1) {
                backBottle(b1, bb2, bb3 - (b1 - bb1));
            } else {
                backBottle(bb1 + bb3, bb2, 0);
            }
        }
    }

}
