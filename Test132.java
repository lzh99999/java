import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            int A1 = 0;//偶数和
            int A2 = 0;//错位相加
            int fuhao = 1;
            int A3 = 0;//数字个数
            double A4 = 0;//平均
            int count = 0;
            int A5 = 0;//max
            for(int i = 0;i < n; i++) {
                int tmp = sc.nextInt();
                int yu = tmp % 5;
                if(tmp %10 ==0) {
                    A1 += tmp;
                }else if(yu ==1) {
                    A2 += fuhao *tmp;
                    fuhao = -1 * fuhao;
                }else if(yu == 2) {
                    A3++;
                }else if(yu == 3) {
                    A4 += tmp;
                    count++;
                }else if(yu == 4){
                    A5 = Math.max(A5,tmp);
                }
            }
            double v = (int) ((A4 / count) * 100);
            if(v %10 >=5) {
                v+=10;
            }
            v /= 100.0;
            System.out.print(A1+" ");
            System.out.print(A2+" ");
            System.out.print(A3+" ");

            System.out.print(((int)(v*10)/10.0)+" ");
            System.out.println(A5);
        }
    }
}