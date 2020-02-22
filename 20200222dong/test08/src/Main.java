import java.util.Scanner;

/**
 * 描述:输入正整数n，判断从1到n之中，数字1一共要出现几次。
 * 例如1123这个数，则出现了两次1。
 * 例如15，那么从1到15之中，一共出现了8个1。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += getCount(i);
        }
        System.out.println(sum);
    }

    private static int getCount(int x) {
        int sum = 0;
        while (x != 0) {
            if (x % 10 == 1) {
                sum++;
            }
            x /= 10;
        }
        return sum;
    }
}
