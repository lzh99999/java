import java.util.Arrays;
import java.util.Scanner;

/**
 * 描述:编写程序，输入3个整数，求出最大数并输出。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
