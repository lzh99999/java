import java.util.Scanner;

/**
 * ����:strncmp������ԭ��Ϊ��int strncmp(char *s, char *t, int n);��
 * �书���ǱȽ��ַ���s��t��ǰn���ַ������s<t������-1�����s=t������0�����s>t������1��
 * ���������ʽ�����������У���һ��Ϊ�ַ���s���ڶ���Ϊ�ַ���t��������Ϊ����n��
 * ���������ʽ�����ֻ��һ�����������ȽϽ����
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n = sc.nextInt();
        str1 = str1.substring(0,n);
        str2 = str2.substring(0,n);
        if (str1.equals(str2)) {
            System.out.println(0);
        }else {
            int i = str1.compareTo(str2);
            if (i>0) {
                System.out.println(1);
            }else {
                System.out.println(-1);
            }
        }
    }
}
