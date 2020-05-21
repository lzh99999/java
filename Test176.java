import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] array = new Long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        long[] longs = new long[n - 1];
        for (int i = 1; i < array.length ; i++) {
            longs[i-1] = array[i]-array[i-1];
            if (longs[i-1] < 1) {
                System.out.println(-1);
                return;
            }
        }
        long gcd = gcd(longs[0],longs[1]);
        for (int i = 2; i < longs.length; i++) {
            long tmp = gcd(longs[i],longs[i-1]);
            if (tmp > gcd) {
                if (tmp % gcd != 0){
                    System.out.println(-1);
                    return;
                }
            }else {
                if (gcd % tmp == 0) {
                    gcd = tmp;
                }else {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(gcd);
    }
    private static long gcd(long a,long b) {
        if (b == 0) {
            return a;
        }
        long tmp = a % b;
        return gcd(b,tmp);
    }
}