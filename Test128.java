

在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同， 则称这种编码为格雷码(Gray Code)，请编写一个函数，使用递归的方法生成N位的格雷码。

给定一个整数n，请返回n位的格雷码，顺序为从0开始。


import java.util.*;
 
public class GrayCode {
    public String[] getGray(int n) {
            int m = 1<<n;
        String[] ret = new String[m];
         if(n == 1) {
                 ret[0] = "0";
                 ret[1] = "1";
                 return ret;
         }else {
                String[] tmp = getGray(n-1);
                int j = 0;
                for(int i = 0;i< m;i++) {
                        if(i<m/2)
                                ret[i] = "0"+tmp[j++];
                        else
                                ret[i] = "1"+tmp[--j];
                }
         }
            return ret;
    }
}