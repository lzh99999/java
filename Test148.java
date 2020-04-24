import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = 0;
        int mut = 1;
        for(int i = 1;i <= n;i++) {
            mut *= i;
            while(mut %10 == 0) {
                ret++;
                mut/=10;
            }
        }
        System.out.println(ret);
    }
}