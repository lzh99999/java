
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //高精度阶乘
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[4000];
        Arrays.fill(arr,0);
        arr[0] = 1;
        int jin = 0;
        for (int i = 2; i <= n ; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] =arr[j] *i +jin;
                jin = arr[j]/10;
                arr[j]%=10;
            }
        }
        int k = arr.length-1;
        for (;k>=0;k--) {
            if (arr[k] != 0) {
                break;
            }
        }
        for (; k >=0 ; k--) {
            System.out.print(arr[k]);
        }

    }
    //判断是否闰年
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0 || (year %4 ==0 && year %100!=0)) {
            System.out.println("yes");
            return;
        }
        System.out.println("no");
    }
    //01串
    public static void main4(String[] args) {
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=1; j++) {
                for (int k = 0; k <=1; k++) {
                    for (int l = 0; l <=1; l++) {
                        for (int m = 0; m <=1; m++) {
                            System.out.println(i+""+j+""+k+""+l+""+m);
                        }
                    }
                }
            }
        }
    }
    //给出n个数，找出这n个数的最大值，最小值，和。
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            if (tmp > max) {
                max = tmp;
            }
            if (tmp<min) {
                min = tmp;
            }
            sum+=tmp;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
    /*
    第一行包含一个整数n。
    第二行包含n个非负整数，为给定的数列，数列中的每个数都不大于10000。
    第三行包含一个整数a，为待查找的数。*/
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ret = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == ret) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }

    //打印杨辉三角
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
