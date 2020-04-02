数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。


import java.util.*;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length == 0) {
                return 0;
        }
            if(array.length == 1) {
                    return array[0];
            }
            Map<Integer,Integer> map = new HashMap<>();
            int len = array.length/2;
            for(int i = 0;i<array.length;i++) {
                    if(map.containsKey(array[i])) {
                          int v = map.get(array[i]);
                            map.put(array[i],v+1);
                            if(v+1>len) {
                                    return array[i];
                            }
                    }else {
                            map.put(array[i],1);
                    }
            }
            return 0;
    }
}