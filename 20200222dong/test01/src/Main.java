import java.util.Scanner;

/**
 * 描述:字符串合并
 * 　输入两个字符串，将其合并为一个字符串后输出。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        for (int i = 0; i < str2.length(); i++) {
            str1 = str1+str2.charAt(i);
        }
        System.out.println(str1);
    }
}
