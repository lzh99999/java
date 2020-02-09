import java.util.Arrays;

/**
 * 描述:冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6,8,3,4,1,9,0,12,7,5};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp；
                }
            }
        }
    }
}
