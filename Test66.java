import java.util.Scanner;

/**
 * ����:��дһ���������������������ֱ����ڱ���x��y���У�
 * Ȼ��ʹ���Լ�����ĺ���swap������������������ֵ��
 * ���������ʽ������ֻ��һ�У���������������
 * ���������ʽ�����ֻ��һ�У�Ҳ�������������������Ժ�Ľ����
 * ����Ҫ���������������ݵ������������������ֱ�ӽ���������������ֵ��
 * ����ͨ�����õ�������ĺ���swap����ɣ���swap����ֻ���𽻻�������ֵ��
 * �������������Ľ�
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
