//�ж��Ƿ��������һ�У������������������꣬�����yes���������no�� 

import java.util.Scanner;

public class Main {
    //�ж��Ƿ�����
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0 || (year %4 ==0 && year %100!=0)) {
            System.out.println("yes");
            return;
        }
        System.out.println("no");
    }
}