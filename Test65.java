import java.util.Scanner;

/**
 * ����:�ַ����ϲ�
 * �����������ַ���������ϲ�Ϊһ���ַ����������
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        for (int i = 0; i < str2.length(); i++) {
            str1 = str1+str2.charAt(i);
        }
        System.out.println(str1);
    }
}
