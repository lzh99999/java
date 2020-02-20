import java.util.Arrays;
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 8, 3, 4, 1, 9, 0, 12, 7, 5};
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
//堆排序
    private static void heapSort(int[] arr) {
        if (arr.length <= 1 ) {
            return;
        }
        buildMaxHeap(arr);//建立大堆
        for (int i = arr.length - 1; i >= 1; i--) {
            swap(arr, 0, i);//进行交换
            maxHeap(arr, i, 0);//在进行建立大堆
        }
    }
//建立大堆
    private static void buildMaxHeap(int[] arr) {
        int half = (arr.length-1)/2;
        for (int i = half; i >=0; i--) {
            maxHeap(arr,arr.length,i);
        }
    }
//进行交换
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
//length 为 每次建立大堆的数组长度  i为从哪开始
    private static void maxHeap(int[] arr, int length, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max = i;
        if (left < length && arr[i] < arr[left]) {
            max = left;
        }
        if (right < length && arr[max] < arr[right]) {
            max = right;
        }
        if (max != i) {
            swap(arr, max, i);
            maxHeap(arr, length, max);
        }
    }

}
