//Fibonacci���еĵ��ƹ�ʽΪ��Fn=Fn-1+Fn-2������F1=F2=1��

//��n�Ƚϴ�ʱ��FnҲ�ǳ�������������֪����Fn����10007�������Ƕ��١�

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long f1 =1;
        long f2 = 1;
        long f3 = 1;
        for (int i = 3; i <= n; i++) {
            f3 = (f1+f2)% 10007;
            f1 = f2%10007;
            f2 = f3%10007;
        }
        System.out.println(f3);
    }
}

