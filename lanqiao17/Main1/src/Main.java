/**
 * 描述:
 * 标题：纸牌三角形
 * A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
 * 下图就是一种排法（如有对齐问题，参看p1.png）。
 * A                                     0
 * 9 6                                  1  2
 * 4   8                                3    4
 * 3 7 5 2                              5 6 7 8
 * 这样的排法可能会有很多。
 * 如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？
 * 请你计算并提交该数字。
 */
public class Main {
    static int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int ret = 0;

    public static void main(String[] args) {
        fun(0);
        System.out.println(ret / 6);
    }

    private static void fun(int k) {
        //因为数组长度就是9  k不能大于9
        if (k == 9) {
            int x1 = arr[0] + arr[1] + arr[3] + arr[5];
            int x2 = arr[0] + arr[2] + arr[4] + arr[8];
            int x3 = arr[5] + arr[6] + arr[7] + arr[8];
            if (x1 == x2 && x2 == x3) {
                ret++;
            }
        }
//进行全排列
        for (int i = k; i < 9; i++) {
            int tmp = arr[i];
            arr[i] = arr[k];
            arr[k] = tmp;
            fun(k + 1);
            tmp = arr[i];
            arr[i] = arr[k];
            arr[k] = tmp;
        }
    }
}
