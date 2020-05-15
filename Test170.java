import java.util.Scanner;

public class Main {
    public static int[] w = new int[]{17 * 29, 29, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] yuan = sc.next().split("\\.");
        String[] shi = sc.next().split("\\.");
        int[] p = {Integer.parseInt(yuan[0]), Integer.parseInt(yuan[1]), Integer.parseInt(yuan[2])};
        int[] a = {Integer.parseInt(shi[0]), Integer.parseInt(shi[1]), Integer.parseInt(shi[2])};
        int ta = a[0] * w[0] + a[1] * w[1] + a[2] * w[2];
        int tp = p[0] * w[0] + p[1] * w[1] + p[2] * w[2];
        int zhao = ta - tp;
        if (zhao < 0) {
            System.out.print("-");
            zhao = -zhao;
        }
        System.out.println(zhao / w[0] + "." + zhao % w[0] / w[1] + "." + zhao % w[0] % w[1] / w[2]);
    }
}