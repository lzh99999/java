import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = 0;
            for (int i = 1;i<=n ;i++ ) {
                if(fun(i,a,b,c)) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
    public static boolean fun(int n ,int a,int b,int c) {
        if(n%a !=0 && n% b != 0 && n%c!=0) return true;
        return false;
    }
}