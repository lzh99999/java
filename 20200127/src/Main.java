public class Main {
    public static void main(String[] args) {

    }
}
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
}*/
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
}*/
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
/*//　　第一行为一个整数n。
//　　第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}*/

/*//输出一行，包括一个整数，表示1+2+3+...+n的值。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        double sum = n*(n+1)/2.0;
        System.out.printf("%.0f",sum);//保留小数点后0位
    }
}*/

/*
//输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double area = 0;
        area = n * n * Math.PI;
        System.out.printf("%.7f",area);
    }
}
*/
