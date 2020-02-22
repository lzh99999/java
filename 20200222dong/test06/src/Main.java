import java.util.Scanner;

/**
 * 描述:一个数S，表示[L,R]区间内的所有数在二进制下包含的“1”的个数之和。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int num = 0;
        for (int i = l; i <= r; i++) {
             num += getCount(i);
        }
        System.out.println(num);
    }

    private static int getCount(int x) {
        int num = 0;
        while (x != 0) {
            if (x % 2 == 1) {
                num++;
            }
            x /= 2;
        }
        return num;
    }
}
