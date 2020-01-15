/*

第一行包含一个整数n。

第二行包含n个非负整数，为给定的数列，数列中的每个数都不大于10000。

第三行包含一个整数a，为待查找的数。*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ret = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == ret) {
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(-1);
    }
}