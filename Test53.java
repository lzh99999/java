//���һ�У�����һ����������ʾ1+2+3+...+n��ֵ�� 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        double sum = n*(n+1)/2.0;
        System.out.printf("%.0f",sum);
    }
}