//请你来实现一个 atoi 函数，使其能将字符串转换成整数
class Solution {
    public int myAtoi(String str) {
          int ret = 0;
        char[] arr = str.toCharArray();
        int i =0;
        int fh = 1;
        int tmp =0;
        if (arr.length ==0) {
            return 0;
        }
        for (; i < arr.length ; i++) {
            if (arr[i] ==' ') {
                continue;
            }            
            if (arr[i] =='-') {
                fh = -1;
                i++;
                break;
            }else {
                if (arr[i] == '+') {
                    i++;
                    break;
                }
                if (arr[i] - '0' < 0 || arr[i] - '0' >9) {
                    return 0;
                }else {
                    break;
                }
            }
        }
        for (; i < arr.length; i++) {
            if (arr[i] - '0' >= 0 && arr[i] - '0' <=9) {
                tmp = (arr[i] -'0') * fh;
                if (ret>Integer.MAX_VALUE /10||(ret == Integer.MAX_VALUE/10 &&tmp >7)) {
                    return Integer.MAX_VALUE;
                }
                if (ret<Integer.MIN_VALUE /10||(ret == Integer.MIN_VALUE/10 &&tmp <-8)) {
                    return Integer.MIN_VALUE;
                }
                ret = ret*10 +tmp;
            }else {
                break;
            }
        }
        return ret;
    }
}