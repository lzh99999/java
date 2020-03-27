统计一个数字在排序数组中出现的次数。

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
            int sum = 0;
            boolean flag = false;
       for(int i =0;i<array.length;i++) {
              if(array[i] == k) {
                      sum++;
                      flag = true;
              }else {
                      if(flag) {
                              break;
                      }
              }
       }
            return sum;
    }
}