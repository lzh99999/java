import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i %a !=0 && i % b !=0 && i % c !=0) {
                count++;
            }
        }
        System.out.println(count);
    }
}