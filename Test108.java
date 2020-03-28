一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
import java.util.*;
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0;i < array.length;i++ ) {
                    if(list.contains(array[i])) {
                            list.remove(new Integer(array[i]));
                    }else {
                            list.add(array[i]);
                    }
            }
            num1[0] = list.get(0);
            num2[0] = list.get(1);
    }
}