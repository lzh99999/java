//判断是否闰年输出一行，如果给定的年份是闰年，则输出yes，否则输出no。 

import java.util.Scanner;

public class Main {
    //判断是否闰年
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