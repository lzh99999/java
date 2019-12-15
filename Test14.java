/*//　　第一行为一个整数n。
//　　第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
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