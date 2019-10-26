public class Test {
    public static int sum (int n) {
       if (n==1) {
           return 1;
       }
       return n + sum(n-1);
    }
    public static void numOne(int n) {
        if (n > 9) {
            numOne(n/10);
        }
            System.out.println(n % 10);
    }
    public static int numSum(int n) {
        if (n < 10) {
            return n ;
        }
        return numSum(n/10) + n % 10;
    }
    public static int febinci1(int n) {
        if (n==1||n==2) {
            return 1;
        }
        return febinci1(n-1) + febinci1(n-2);
    }
    public static int febinci2(int n) {
        int[] sum =new int[100];
        sum[0]=1;
        sum[1]=1;
        if (n==1||n==2) {
            return 1;
        }
        for (int i = 2; i < n ; i++) {
             sum[i]=sum[i-1]+sum[i-2];
        }
        return sum[n-1];
    }
    //青蛙跳台阶forgDrop变相的斐波那契数列
    public static int forgDrop(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return forgDrop(n - 1) + forgDrop(n - 2);
    }
    public static int forgDrop1(int n) {
        int a = 1;
        int b = 2;
        int c = 0;
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        for (int i = 3; i <= n ; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
       // System.out.println(sum(4));
       //numOne(345);
       // System.out.println(numSum(234));
//        System.out.println(febinci1(6));
//        System.out.println(febinci2(6));
        System.out.println(forgDrop(5));
        System.out.println(forgDrop1(5));
    }
}
