////����n�������ҳ���n���������ֵ����Сֵ���͡�

import java.util.Scanner;

public class Main {
    //����n�������ҳ���n���������ֵ����Сֵ���͡�
    public static void main(String[] args) {
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
}