public class Solution {
    //迭代
    public int Fibonacci(int n) {
        int n1 = 0;
        if(n==0) return n1;
        int n2 = 1;
        if(n==1) return n2;
        int n3 = 0;
        for(int i = 2;i<=n;i++) {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
    
    //递归
  /*  public int Fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }*/
}