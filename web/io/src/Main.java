
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mut = a * b;
        if (a < b) {
            int c = a;
            a = b;
            b = c;
        }
        if (a % b == 0) {
            System.out.println(mut / b);
            return;
        }
        while (a % b > 0) {
            if (a < b) {
                int c = a;
                a = b;
                b = c;
            }
            if (a % b == 0) {
                System.out.println(mut / b);
                return;
            }
            a = a % b;
        }
    }
}