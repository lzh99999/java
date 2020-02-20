import com.sun.org.apache.bcel.internal.generic.Select;

import java.util.Arrays;

/**
 * 描述:选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6,8,3,4,1,9,0,12,7,5};
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }
}
