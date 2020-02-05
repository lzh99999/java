
/**
 * 描述:
 * 输入第一行是两个不超过200的正整数m, n，表示矩阵的行和列。
 * 接下来m行每行n个整数，表示这个矩阵。
 * 输出格式
 * 　　输出只有一行，共mn个数，为输入矩阵回形取数得到的结果。
 * 数之间用一个空格分隔，行末不要有多余的空格。
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] flag = new int[m][n];
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int i = 0;
        int j = 0;
        int count = m * n;
        while (count>0) {
            while (i<m && flag[i][j]==0) {
                System.out.print(arr[i][j]+" ");
                flag[i][j] = 1;
                count--;
                i++;
            }
            i--;
            j++;
            while (j<n && flag[i][j]==0) {
                System.out.print(arr[i][j]+" ");
                count--;
                flag[i][j] = 1;
                j++;
            }
            j--;
            i--;
            while (i>=0 && flag[i][j]==0) {
                System.out.print(arr[i][j]+" ");
                flag[i][j] = 1;
                count--;
                i--;
            }
            i++;
            j--;
            while (j>=0 && flag[i][j]==0) {
                System.out.print(arr[i][j]+" ");
                flag[i][j] = 1;
                count--;
                j--;
            }
            i++;
            j++;
        }
    }
}
