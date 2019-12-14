/*//　　按从小到大的顺序输出满足条件的四位十进制数。
public class Main {
    static boolean isHuiWen(int n) {
        int tmp = n;
        int ret = 0;
        while (tmp !=0) {
            int yu = tmp % 10;
            ret = ret *10 + yu;
            tmp/=10;
        }
        return n == ret;
    }
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            if (isHuiWen(i)) {
                System.out.println(i);
            }
        }
    }