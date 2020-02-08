import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 描述:基数排序
 */
public class BaseSort {
    public static void main(String[] args) {
        int[] arr = new int[]{67, 85, 378, 478, 156, 9, 45, 0, 12, 7, 5};
        System.out.println(Arrays.toString(arr));
        baseSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void baseSort(int[] arr) {
        int max = arr[0];
        //找出最大数
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        //找出最大数是多少位
        int times = 0;
        while (max != 0) {
            max /= 10;
            times++;
        }
        //总共循环times次
        for (int i = 0; i < times; i++) {
            //创建10个 保存余数为 0~9的数
            List<ArrayList<Integer>> lists  = new ArrayList<>();
             for (int j = 0; j < 10; j++) {
                lists.add(new ArrayList<>());
            }
            for (int j = 0; j < arr.length; j++) {
                 //123    123   1
                int x = arr[j] % (int) Math.pow(10,i+1)/(int)Math.pow(10,i);
                ArrayList<Integer> tmp = lists.get(x);
                tmp.add(arr[j]);
            }
            int count = 0;
            for (int j = 0; j < 10; j++) {
                while (lists.get(j).size()>0) {
                    ArrayList<Integer> tmp = lists.get(j);
                    arr[count++] = tmp.get(0);
                    tmp.remove(0);
                }
            }
        }
    }
}
