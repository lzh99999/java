import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            int sum = fun(n);
            int ret = fun((int)Math.pow(n,2));
            System.out.println(sum+" "+ret);
        }
    }
    private static int fun(int n) {
        if(n==0) {
            return 0;
        }
        return fun(n/10) + n%10;
    }
}