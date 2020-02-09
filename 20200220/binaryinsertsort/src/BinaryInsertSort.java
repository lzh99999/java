import java.util.Arrays;

/**
 * 描述:二分查找插入算法
 */
public class BinaryInsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 8, 3, 4, 1, 9, 0, 12, 7, 5};
        System.out.println(Arrays.toString(arr));
        binaryInsertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void binaryInsertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int left = 0;
            int right = i - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] >tmp) {
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }
            for (int j = i-1; j >= left; j--) {
                arr[j+1] = arr[j];
            }
            arr[left] = tmp;
        }
    }
}
