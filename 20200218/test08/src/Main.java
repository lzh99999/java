
/**
 * 描述:描述
 * 　　FJ在沙盘上写了这样一些字符串：
 * 　　A1 = “A”
 * 　　A2 = “ABA”
 * 　　A3 = “ABACABA”
 * 　　A4 = “ABACABADABACABA”
 * 　　… …
 * 　　你能找出其中的规律并写所有的数列AN吗？
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        for (int i = 0; i < n; i++) {
            str = str+((char)(i+65))+str;
        }
        System.out.println(str);
    }
}
