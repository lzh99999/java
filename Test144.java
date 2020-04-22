import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char ch = str.charAt(0);
        for(int i = 0;i< n;i++) {
            System.out.print(ch);
        }
        System.out.println();
        System.out.println();
        int k = n%2;
        if(k == 0) {
            k = n/2;
        }else {
            k = n/2 +1;
        }
        for(int i = 0;i<k-2;i++) {
            System.out.println(ch+" "+ch);
            System.out.println();
        }
        for(int i = 0;i< n;i++) {
            System.out.print(ch);
        }
    }
}