/*//������һ��Ϊһ������n��
//�����ڶ��а���n��������Ϊ�����������ÿ�������ľ���ֵС��10000��
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}*/