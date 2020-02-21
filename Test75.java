import java.util.Scanner;

/**
 * 描述:strncmp函数的原型为：int strncmp(char *s, char *t, int n);，
 * 其功能是比较字符串s和t的前n个字符。如果s<t，返回-1；如果s=t，返回0；如果s>t，返回1。
 * 　　输入格式：输入有三行，第一行为字符串s，第二行为字符串t，第三行为整数n。
 * 　　输出格式：输出只有一个整数，即比较结果。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n = sc.nextInt();
        str1 = str1.substring(0,n);
        str2 = str2.substring(0,n);
        if (str1.equals(str2)) {
            System.out.println(0);
        }else {
            int i = str1.compareTo(str2);
            if (i>0) {
                System.out.println(1);
            }else {
                System.out.println(-1);
            }
        }
    }
}
