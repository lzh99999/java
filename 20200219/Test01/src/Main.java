import java.util.Arrays;

/**
 * 描述:selectSort 选择排序
 * 就是找到最小的数然后和未排序的第一个进行交换
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{9,243,54,234,8,9,56,78,123,2345};
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min] >arr[j]) {
                    min = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }
}
