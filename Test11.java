/*//153��һ���ǳ��������������������ÿλ���ֵ������ͣ�
// ��153=1*1*1+5*5*5+3*3*3���������������������������λʮ��������
public class Main {
    static boolean isFun(int n) {
        int tmp = n;
        int ret =0;
        while (tmp!=0) {
            int yu = tmp % 10;
            ret += yu * yu * yu;
            tmp /= 10;
        }
        return ret == n;
    }
    public static void main(String[] args) {
        for (int i = 100; i <= 999 ; i++) {
            if (isFun(i)) {
                System.out.println(i);
            }
        }
    }