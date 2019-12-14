/*//153是一个非常特殊的数，它等于它的每位数字的立方和，
// 即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
public class Main {
    static boolean isFun(int n) {
        int tmp = n;
        int ret =0;
        while (tmp!=0) {
            int yu = tmp % 10;
            ret += yu * yu * yu;
            tmp /= 10;
        }
        return ret == n;
    }
    public static void main(String[] args) {
        for (int i = 100; i <= 999 ; i++) {
            if (isFun(i)) {
                System.out.println(i);
            }
        }
    }