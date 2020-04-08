

有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角。请设计一个算法，计算机器人有多少种走法。

给定两个正整数int x,int y，请返回机器人的走法数目。保证x＋y小于等于12。

import java.util.*;

public class Robot {
        //迭代
    public int countWays(int x, int y) {
           int[][] array = new int[x][y];
            array[0][0] = 1;
            for(int i = 1;i< x;i++) {
                    array[i][0] = array[i-1][0];
            }
            for(int i = 1;i< y;i++) {
                    array[0][i] = array[0][i-1];
            }
            for(int i = 1;i < x;i++) {
                    for(int j = 1;j<y;j++) {
                            array[i][j] = array[i-1][j]+array[i][j-1];
                    }
            }
            return array[x-1][y-1];
    }
        //递归实现
        /*
    public int countWays(int x, int y) {
        if(x==1 || y == 1) return 1;
        return countWays(x-1,y)+countWays(x,y-1);
    }*/
}