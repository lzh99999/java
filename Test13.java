/*//123321��һ���ǳ����������������߶��ʹ��ұ߶���һ���ġ�
//��������һ��������n�� �����������������λ����λʮ�������������λ����֮�͵���n ��
import java.util.Scanner;
public class Main {
    static boolean isHuiWen(int n) {
        int tmp = n;
        int ret = 0;
        while (tmp !=0) {
            int yu = tmp % 10;
            ret = ret *10 + yu;
            tmp/=10;
        }
        return n == ret;
    }
    static boolean isEqualsN (int i,int n) {
        int ret =0;
        while (i !=0) {
            int yu = i%10;
            ret+=yu;
            i/=10;
        }
        return ret == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 10000; i <= 999999; i++) {
            if (isHuiWen(i)) {
                if (isEqualsN(i,n)) {
                    System.out.println(i);
                }
            }
        }
    }
}*/