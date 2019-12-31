//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int tmp = 0;
        int ret = x;
        while(ret !=0) {
            int a = ret % 10;
            tmp = tmp*10 + a;
            ret /= 10;
        }
        return tmp == x;
    }
}