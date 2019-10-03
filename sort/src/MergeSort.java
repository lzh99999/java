import java.util.Arrays;

public class MergeSort {
    //归并排序
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 0, 2, 5, 8,5,6,8, 3 };
        System.out.println(Arrays.toString(arr));
        merge(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //递归归并算法
    public static void merge(int[] arr, int start, int end) {
        if(start<end) {
            int middle = (start + end) / 2;

            merge(arr, start, middle);
            merge(arr, middle + 1, end);
            mergeSort(arr, start, middle, end);
        }
    }
    public static void mergeSort(int[] arr, int low, int middle, int high) {


// 临时数组存放归并后
        int[] temp = new int[high - low + 1];
// 第一个数组的下标
        int i = low;
// 第二个数组的下标
        int j = middle + 1;
// 归并后数组的下标
        int index = 0;
// 遍历两个数组取出较小的数，放入临时数组
        while (i <= middle && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[index] = arr[i];
                i++;
            } else {
                temp[index] = arr[j];
                j++;
            }

            index++;
        }


// 第一个数组元素取完，第二个数组没有取完，直接把第二个数组剩的元素直接拷贝
        while (j <= high) {
            temp[index] = arr[j];
            j++;
            index++;
        }
// 第二个数组元素取完，第一个数组没有取完，直接把第一个数组剩的元素直接拷贝
        while (i <= middle) {
            temp[index] = arr[i];
            i++;
            index++;
        }
// 将临时数组的元素拷贝给原来的数组
        for (int k = 0; k < temp.length; k++) {
            arr[k + low] = temp[k];
        }
    }

}
