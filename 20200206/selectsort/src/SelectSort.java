import java.util.Arrays;

/**
 * 描述:选择排序（从小到大）
 * 1，每次找出最小的元素和前面的未确定的元素进行交换
 * 2，就是每次找到最小元素就放在前面
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{99, 88, 77, 66, 55, 44, 33, 11, 22};
        System.out.println(Arrays.toString(arr));
        arr = selectSort(arr);
        System.out.println("------------------------");
        System.out.println(Arrays.toString(arr));
    }

    private static int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = min+1; j <arr.length ; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
        return arr;
    }
}
