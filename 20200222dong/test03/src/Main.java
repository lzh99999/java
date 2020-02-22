import java.util.Scanner;

/**
 * 描述:编写一个程序，输入两个整数，分别存放在变量x和y当中，
 * 然后使用自己定义的函数swap来交换这两个变量的值。
 * 　　输入格式：输入只有一行，包括两个整数。
 * 　　输出格式：输出只有一行，也是两个整数，即交换以后的结果。
 * 　　要求：主函数负责数据的输入与输出，但不能直接交换这两个变量的值，
 * 必须通过调用单独定义的函数swap来完成，而swap函数只负责交换变量的值，
 * 不能输出交换后的结
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] arr = new int[2];
        arr[0] = x;
        arr[1] = y;
        swap(arr,0,1);
        System.out.println(arr[0] +" "+arr[1]);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
