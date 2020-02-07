
/**
 * 描述:An=sin(1–sin(2+sin(3–sin(4+...sin(n))...)
 * 　　Sn=(...(A1+n)A2+n-1)A3+...+2)An+1
 * 　　FJ想让奶牛们计算Sn的值，请你帮助FJ打印出Sn的完整表达式，以方便奶牛们做题。
 * A1=sin(1)
 * A2=sin(1-sin(2))
 * A3=sin(1-sin(2+sin(3)))
 *
 * S1=A1+1
 * S2=(A1+2)A2+1
 * S3=((A1+3)A2+2)A3+1
 */
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner cn = new Scanner(System.in);
        int t = cn.nextInt();
        String str2 = String.valueOf(S(t));
        System.out.println(str2);     //其实不将StringBuffer类型转化成String类型输出也可以
    }

    public static StringBuffer S(int t)   //产生Sn的函数
    {
        String str = "";
        for (int i = 1; i < t; i++)
            str = str + "(";
        for (int i = 1, j = t; i <= t; i++, j--) {
            str = str + A(i) + "+" + j + ")";    //期间调用产生An 的函数
        }
        StringBuffer str2 = new StringBuffer(str);
        str2.deleteCharAt(str2.length() - 1);     //因为多产生了一个  “）”
        return str2;
    }

    public static StringBuffer A(int i) {
        String str = "";
        for (int t = 1; t <= i; t++) {
            if (t % 2 != 0)
                str = str + "+" + "sin(" + t;   //这样会使弟一项也会有一个“+”   所以后续得去掉
            else str = str + "-" + "sin(" + t;
        }
        for (int t = 1; t <= i; t++)
            str = str + ")";
        StringBuffer str2 = new StringBuffer(str);   //因为多产生了一个“+”号
        str2.deleteCharAt(0);
        return str2;
    }
}
