import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            if(n <= 2){
                System.out.println(0);
                return;
            }
            int f1 = 0;
            int f2 = 1;
            int f3 = 1;
            while(f3 < n) {
                f3 = f1+f2;
                if(f3 >= n){
                    break;
                }
                f1 = f2;
                f2 = f3;
            }
            System.out.println(Math.min(f3-n,n-f2));
        }
    }
}