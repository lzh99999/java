import java.util.Scanner;
//计算1——n质数的数量
public class Test {
    public static boolean prime(int num) {
        if (num==1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num ; i++) {
            if (num % i==0) {
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("一个整数：");
        int num = in.nextInt();
        int j = 0;
        for (int i = 1; i <= num; i++) {
            if (prime(i)) {
                j++;
            }
        }
        System.out.println("质数的数量："+j );
    }


}
