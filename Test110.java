输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<>();
            if(array == null || array.length <= 1) {
                    return list;
            }
            int a = array[0];
            int b = array[1];
            boolean flag = false;
            int mut = array[array.length-1]*array[array.length-1];
            for(int i= 0;i<array.length;i++) {
                    for(int j =i+1;j<array.length;j++) {
                            if(array[i]+array[j] == sum) {
                                    flag = true;
                                   if(array[i] * array[j] < mut) {
                                           mut = array[i]*array[j];
                                           a = array[i];
                                           b = array[j];
                                   }
                            }
                    }
            }
            if(!flag) {
                    return list;
            }
            if(a<b) {
                    list.add(a);
                    list.add(b);
            }else {
                    list.add(b);
                    list.add(a);
            }
            return list;
    }
}