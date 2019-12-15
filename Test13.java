/*//123321是一个非常特殊的数，它从左边读和从右边读是一样的。
//　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
import java.util.Scanner;
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
    static boolean isEqualsN (int i,int n) {
        int ret =0;
        while (i !=0) {
            int yu = i%10;
            ret+=yu;
            i/=10;
        }
        return ret == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 10000; i <= 999999; i++) {
            if (isHuiWen(i)) {
                if (isEqualsN(i,n)) {
                    System.out.println(i);
                }
            }
        }
    }
}*/