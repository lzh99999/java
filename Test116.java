输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.


import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
       if(matrix == null) {
               return null;
       }
            ArrayList<Integer> list = new ArrayList<>();
            int left = 0;
            int right = matrix[0].length-1;
            int up = 0;
            int down = matrix.length-1;
            while(left <= right && up <= down) {
                    //右
                 for(int i = left; i<= right;i++) {
                         list.add(matrix[up][i]);
                 }
                    //下
                    for(int i = up+1; i<= down;i++) {
                         list.add(matrix[i][right]);
                 }
                    //左
                    if(up <down){
                    for(int i = right-1; i>=left;i--) {
                         list.add(matrix[down][i]);
                 }
                    }
                    //上
                    if(left < right ) {
                    for(int i = down-1; i>up;i--) {
                         list.add(matrix[i][left]);
                 }
                    }
                    left++;
                    right--;
                    up++;
                    down--;
            }
            return list;
    }
}