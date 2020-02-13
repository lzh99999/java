import java.util.Scanner;

/**
 * 描述:编写一个程序，读入一组整数（不超过20个），并把它们保存在一个整型数组中。
 * 当用户输入0时，表示输入结束。然后程序将把这个数组中的值按逆序重新存放，
 * 并打印出来。要求：(1)只能定义一个数组；
 * (2)在交换两个数组元素的值时，必须使用单独定义的一个函数swap
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 0; i < arr.length; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                break;
            } else {
                arr[i] = x;
            }
        }
        for (int j = 0; j < i/2; j++) {
            swap(arr, j, i - 1 - j);
        }
        for (int x : arr) {
            if (x ==0){
                break;
            }
            System.out.print(x + " ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
