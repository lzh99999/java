import java.util.Scanner;

/**
 * ����:Ȼ�����n!���ұߵ��Ǹ���0�������Ƕ��١�
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 1;
        for (int i = n; i > 1; i--) {
            sum *= i;
            if (sum % 10 == 0) {
                sum /= 10;
                sum %= 1000;
            }
        }
        System.out.println(sum % 10);
    }
}
