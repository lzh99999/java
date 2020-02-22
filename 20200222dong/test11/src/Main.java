import java.util.Arrays;
import java.util.Scanner;

/**
 * 描述:将小写字符串排序
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
