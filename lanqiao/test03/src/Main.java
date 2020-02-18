import java.util.Scanner;

/**
 * 描述:描述
 * 　　给定一个n*n的棋盘，棋盘中有一些位置不能放皇后。现在要向棋盘中放入n个黑皇后和n个白皇后，
 * 使任意的两个黑皇后都不在同一行、同一列或同一条对角线上，任意的两个白皇后都不在同一行、
 * 同一列或同一条对角线上。问总共有多少种放法？n小于等于8。
 * 输入格式
 * 　　输入的第一行为一个整数n，表示棋盘的大小。
 * 　　接下来n行，每行n个0或1的整数，如果一个整数为1，表示对应的位置可以放皇后，
 * 如果一个整数为0，表示对应的位置不可以放皇后。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    private static void fun(int[][] arr, int x) {
        
    }
}
