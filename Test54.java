//���һ�У�����һ��ʵ�����������뱣��С�����7λ����ʾԲ������� 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double area = 0;
        area = n * n * Math.PI;
        System.out.printf("%.7f",area);
    }
}
