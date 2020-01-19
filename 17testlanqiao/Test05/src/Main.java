import java.util.Scanner;

/**
 * 描述:包子凑数问题
 * 输入
 * ----
 * 第一行包含一个整数N。(1 <= N <= 100)
 * 以下N行每行包含一个整数Ai。(1 <= Ai <= 100)
 * 输出
 * ----
 * 一个整数代表答案。如果凑不出的数目有无限多个，输出INF。
 * 例如，
 * 输入：
 * 2
 * 4
 * 5
 * <p>
 * 程序应该输出：
 * 6
 * 再例如，
 * 输入：
 * 2
 * 4
 * 6
 * 程序应该输出：
 * INF
 * 样例解释：
 * 对于样例1，凑不出的数目包括：1, 2, 3, 6, 7, 11。
 * 对于样例2，所有奇数都凑不出来，所以有无限多个。
 */
public class Main {
    static  int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int yueshu = arr[0];
        for (int i = 1; i < n; i++) {
            yueshu = yue(yueshu,arr[i]);
        }
        if (yueshu != 1) {
            System.out.println("INF");
        } else {
            boolean[] booleans = new boolean[10000];
            booleans[0] = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; arr[i]+j < 10000; j++) {
                    if (booleans[j]) {
                        booleans[arr[i]+j] = true;
                    }
                }
            }
            for (int i = 0; i < 10000; i++) {
                if (!booleans[i]) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }

    private static int yue(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return yue(y, x % y);
        }
    }
}
