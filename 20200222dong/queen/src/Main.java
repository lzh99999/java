import java.util.Scanner;

/**
 * 描述:
 */
public class Main {
    static int sum = 0;
   static int[][] arr;
   static int[] queen;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n][n];
        queen = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        fun( 0);
        System.out.println(sum);
    }

    private static void fun( int i) {
        System.out.println(i);
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[j][k]+" ");
            }
            System.out.println();
        }
        for (int j = 0; j < i; j++) {
            arr[queen[j]][i] = 0;
            int d = i - j;
            //右对角线
            if (queen[j] - d >= 0) {
                arr[queen[j] - d][i] = 0;
            }
            if (queen[j] + d < arr.length) {
                arr[queen[j] + d][i] = 0;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j][i] == 0) {
                continue;
            }
            queen[i] = j;
            arr[j][i] = 4;
            if (i < arr.length) {
                fun( i + 1);

            } else {
                sum++;
            }
        }
    }
}


