

/**
 * 描述:
 * 标题：纸牌三角形
 * A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
 * 下图就是一种排法（如有对齐问题，参看p1.png）。
 * A                                0                               i
 * 9 6                             1   2                         j     k
 * 4   8                          3      4                      l       m
 * 3 7 5 2                       5 6   7   8                   n  o  p   q
 * <p>
 * 这样的排法可能会有很多。
 * <p>
 * 如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？
 * <p>
 * 请你计算并提交该数字。
 * <p>
 * 注意：需要提交的是一个整数，不要提交任何多余内容。
 * 144
 */
public class Main {
    static int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int ans = 0;

    //暴力解法
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i != j) {
                    for (int k = 0; k < 9; k++) {
                        if (i != k && j != k) {
                            for (int l = 0; l < 9; l++) {
                                if (i != l && j != l && k != l) {
                                    for (int m = 0; m < 9; m++) {
                                        if (i != m && j != m && k != m && l != m) {
                                            for (int n = 0; n < 9; n++) {
                                                if (i != n && j != n && k != n && l != n && m != n) {
                                                    for (int o = 0; o < 9; o++) {
                                                        if (i != o && j != o && k != o && l != o && m != o && n != o) {
                                                            for (int p = 0; p < 9; p++) {
                                                                if (i != p && j != p && k != p && l != p && m != p && n != p && o != p) {
                                                                    for (int q = 0; q < 9; q++) {
                                                                        if (i != q && j != q && k != q && l != q && m != q && n != q && q != o && p != q) {
                                                                            int x1 = arr[i] + arr[j] + arr[n] + arr[l];
                                                                            int x2 = arr[q] + arr[n] + arr[o] + arr[p];
                                                                            int x3 = arr[i] + arr[k] + arr[m] + arr[q];
                                                                            if (x1 == x2 && x2 == x3) {
                                                                                ans++;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans / 6);
    }


    //进行全排列实现
    public static void main1(String[] args) {

        fun(0);
        System.out.println(ans / 6);
    }

    private static void fun(int k) {
        if (k == 9) {
            int x1 = arr[0] + arr[1] + arr[3] + arr[5];
            int x2 = arr[0] + arr[2] + arr[4] + arr[8];
            int x3 = arr[5] + arr[6] + arr[7] + arr[8];
            if (x1 == x2 && x2 == x3) {
                ans++;
            }
        }
        for (int i = k; i < 9; i++) {
            int tmp = arr[k];
            arr[k] = arr[i];
            arr[i] = tmp;
            fun(k + 1);
            tmp = arr[k];
            arr[k] = arr[i];
            arr[i] = tmp;
        }
    }
}
