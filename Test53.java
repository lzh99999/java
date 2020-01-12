//输出一行，包括一个整数，表示1+2+3+...+n的值。 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        double sum = n*(n+1)/2.0;
        System.out.printf("%.0f",sum);
    }
}