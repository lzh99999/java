import java.util.Scanner;

/**
 * ����:����
 * �ó��������һ������GetTwoInts�����������������Ӽ��̶����100���ڵ�������
 * Ȼ���������������֮�ͣ����Ѵ���ʾ������
 * Ҫ�����������в���ʹ��scanf�Ⱥ���ֱ������������������
 * ������ͨ������GetTwoInts��������ɣ���GetTwoInts�����п���ʹ��scanf������
 * ���⣬���ڸú�������ͬʱ����������������˲��ܲ��ú�������ֵ�ķ�ʽ��
 * ���������ָ��ķ�����ʵ�֡�
 * ���������ʽ������ֻ��һ�У�������100���ڵ�������
 * ���������ʽ�����ֻ��һ�У�������������֮�͡�
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = GetTwoInts();
        System.out.println(arr[0] + arr[1]);
    }

    private static int[] GetTwoInts() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        return new int[]{x, y};
    }
}
