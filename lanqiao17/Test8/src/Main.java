import java.util.Scanner;

/**
 * 描述:
 * <p>
 * 标题： 分巧克力   使用二分枚举
 * <p>
 * 儿童节那天有K位小朋友到小明家做客。小明拿出了珍藏的巧克力招待小朋友们。
 * 小明一共有N块巧克力，其中第i块是Hi x Wi的方格组成的长方形。
 * <p>
 * 为了公平起见，小明需要从这 N 块巧克力中切出K块巧克力分给小朋友们。切出的巧克力需要满足：
 * <p>
 * 1. 形状是正方形，边长是整数
 * 2. 大小相同
 * 例如一块6x5的巧克力可以切出6块2x2的巧克力或者2块3x3的巧克力。
 * 当然小朋友们都希望得到的巧克力尽可能大，你能帮小Hi计算出最大的边长是多少么？
 * 输入
 * 第一行包含两个整数N和K。(1 <= N, K <= 100000)
 * 以下N行每行包含两个整数Hi和Wi。(1 <= Hi, Wi <= 100000)
 * 输入保证每位小朋友至少能获得一块1x1的巧克力。
 * 输出
 * 输出切出的正方形巧克力最大可能的边长。
 * 样例输入：
 * 2 10
 * 6 5
 * 5 6
 * 样例输出：
 * 2
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] h = new int[n];
        int[] w = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            w[i] = sc.nextInt();
            if (max < h[i]) {
                max = h[i];
            }
            if (max < w[i]) {
                max = w[i];
            }
        }

        int left = 1;
        int r = max;
        int ans = 0;
        while (left <= r) {
            int cut = 0;
            int mid = (left + r) / 2;
            for (int i = 0; i < n; i++) {
                cut += (h[i] / mid) * (w[i] / mid);
            }
            if (cut >= k) {
                left = mid + 1;
                ans = mid;
            } else {
                r = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
