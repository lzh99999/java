/*

��һ�а���һ������n��

�ڶ��а���n���Ǹ�������Ϊ���������У������е�ÿ������������10000��

�����а���һ������a��Ϊ�����ҵ�����*/
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