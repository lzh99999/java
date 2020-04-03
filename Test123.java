给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。


import java.util.*;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> list = new ArrayList<>();
        if(num == null || size <=0) {
            return list;
        }
        int length = num.length;
        int end = length-size;
        for(int i = 0;i <= end;i++) {
            int max = num[i];
            int tmp = size-1;
            int j = i+1;
            while(j < length&& tmp > 0) {
                if(max < num[j]) {
                    max = num[j];
                }
                j++;
                tmp--;
            }
            list.add(max);
        }
        return list;
    }
}