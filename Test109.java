输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序

import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            if(sum <= 0) {
                    return list;
            }
            for(int i =1;i< sum;i++) {
                    int tmp = i;
                    int begin =i;
                    for(int j = i+1;j<sum;j++) {
                            tmp+=j;
                            if(tmp == sum) {
                                  ArrayList<Integer> arr = new ArrayList<>();
                                    for(int k = begin;k<= j;k++ ) {
                                            arr.add(k);
                                    }
                                    list.add(arr);
                            }else if(tmp > sum) {
                                    break;
                            }
                    }
            }
                 return list;
    }

}
