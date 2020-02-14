import java.util.Arrays;

/**
 * 描述:冒泡排序 一直冒最大的数
 *一直让两个数一直比较可以把最大的值放到最后
 * 每进行一次就把最大的数放在最后
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{8,6,5,4,3,2,78,65};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    private static void bubbleSort(int[] arr) {
        int len = arr.length-1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
