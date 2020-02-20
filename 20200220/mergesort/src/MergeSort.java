import java.util.Arrays;

/**
 * 描述:归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 8, 3, 4, 1, 9, 0, 12, 7, 5};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] tmp = new int[arr.length];
        int tm1 = left;
        int rights = mid + 1;
        int i = left;
        while (left <= mid  && rights <= right) {
            if (arr[left] <= arr[rights]) {
                tmp[i++] = arr[left++];
            } else {
                tmp[i++] = arr[rights++];
            }
        }
            while (left <= mid) {
                tmp[i++] = arr[left++];
            }
            while (rights <= right) {
                tmp[i++] = arr[rights++];
            }

        while (tm1 <=right) {
            arr[tm1] = tmp[tm1];
            tm1++;
        }
    }

}
