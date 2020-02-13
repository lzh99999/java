import java.util.Scanner;

/**
 * ����:��дһ�����򣬶���һ��������������20�������������Ǳ�����һ�����������С�
 * ���û�����0ʱ����ʾ���������Ȼ����򽫰���������е�ֵ���������´�ţ�
 * ����ӡ������Ҫ��(1)ֻ�ܶ���һ�����飻
 * (2)�ڽ�����������Ԫ�ص�ֵʱ������ʹ�õ��������һ������swap
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
