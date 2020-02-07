import java.util.Scanner;

/**
 * 描述:给定一个N阶矩阵A，输出A的M次幂（M是非负整数）
 * 输入格式
 * 　　第一行是一个正整数N、M（1<=N<=30, 0<=M<=5），表示矩阵A的阶数和要求的幂数
 * 　　接下来N行，每行N个绝对值不超过10的非负整数，描述矩阵A的值
 * 输出格式
 * 　　输出共N行，每行N个整数，表示A的M次幂所对应的矩阵。相邻的数之间用一个空格隔开
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ret = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ret[i][j] = sc.nextInt();
            }
        }
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ret[i][j] = 1;
                    System.out.print(ret[i][j] + " ");
                }
                System.out.println();
            }
        } else if (m == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(ret[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            for (int i = 2; i <= m; i++) {
                ret = muit(ret, ret);
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(ret[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    private static int[][] muit(int[][] A, int[][] B) {
        int[][] C = new int[A.length][B.length];
        for (int y = 0; y < A.length; y++) {
            for (int i = 0; i < A.length; i++) {
                int tmp = 0;
                for (int j = 0; j < B.length; j++) {
                    tmp += A[y][j] * B[j][i];
                }
                C[y][i] = tmp;
            }
        }

        return C;
    }
}
