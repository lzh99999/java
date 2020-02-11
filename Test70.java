import java.util.Scanner;

/**
 * 描述:　大等于n的最小的完全平方数
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long i = (int)Math.sqrt(n);
        for (; i < Long.MAX_VALUE; i++) {
            if (Math.pow(i,2) >= n) {
                System.out.println(i*i);
                break;
            }
        }
    }
}
