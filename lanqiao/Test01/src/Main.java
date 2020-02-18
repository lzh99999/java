import java.util.Scanner;

/**
 * 描述:输入两个整数a和b，输出这两个整数的和。a和b都不超过100位。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        StringBuilder str = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int count = 0;
        while(i >= 0 || j >= 0) {
            int a = i>=0 ? num1.charAt(i)-'0':0;
            int b = j>=0 ? num2.charAt(j)-'0':0;
            int tmp = a+b+count;
            count = tmp/10;
            str.append(tmp%10);
            i--;
            j--;
        }
        if(count == 1) {
            str.append(1);
        }
        System.out.println(str.reverse().toString());
    }
}
