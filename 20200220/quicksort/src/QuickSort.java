import java.util.Arrays;

/**
 * 描述:快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6,8,3,4,1,9,0,12,7,5};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int left, int right) {
        int start = left;
        int end = right;
        int flag = arr[left];
        if (left < right) {
            while (left < right) {
                while (left < right && arr[right] >= flag) {
                    right--;
                }
                arr[left] = arr[right];
                while (left < right && arr[left] <= flag) {
                    left++;
                }
                arr[right] = arr[left];
            }
            arr[left] = flag;
            quickSort(arr,start,left);
            quickSort(arr,left+1,end);
        }
    }

}
