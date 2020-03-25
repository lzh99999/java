很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
            int sum =0;
            for(int i =1;i<=n;i++) {
                    sum+=getNumber(i);
            }
            return sum;
    }
        private int getNumber(int n) {
                int sum =0;
                while(n != 0) {
                    int tmp = n%10;
                        if(tmp == 1) {
                                sum++;
                        }
                        n/=10;
                }
                return sum;
        }
}