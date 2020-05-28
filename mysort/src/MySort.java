import java.util.Arrays;

public class MySort {
    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    //冒泡
    private static void bubbleSort(int[] array) {
        if (null == array || array.length == 0) return;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }

    //选择
    private static void selectSort(int[] array) {
        if (null == array || array.length == 0) return;
        for (int i = 0; i < array.length; i++) {
            int max = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[max] < array[j]) {
                    max = j;
                }
            }
            if (max != array.length - 1 - i) {
                swap(array, max, array.length - 1 - i);
            }
        }
    }

    //插入
    private static void insertSort(int[] array) {
        if (null == array || array.length == 0) return;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }
    }

    //希尔
    private static void shellSort(int[] array) {

    }

    //堆
    private static void heapSort(int[] array) {
        if (null == array || array.length == 0) return;
        int size = array.length - 1;
        for (int i = (size - 1) / 2; i >= 0; i--) {
            shutDown(array, i, array.length);
        }
        while (size > 0) {
            swap(array, 0, size);
            shutDown(array, 0, size);
            size--;
        }
    }

    //向下调整
    private static void shutDown(int[] array, int i, int length) {
        int child = 2 * i + 1;
        while (child < length) {
            if (child + 1 < length && array[child] < array[child + 1]) {
                child++;
            }
            if (array[i] > array[child]) {
                break;
            } else {
                swap(array, i, child);
                i = child;
                child = 2 * i + 1;
            }
        }
    }

    //归并
    private static void mergeSort(int[] array) {
        int[] tmp = new int[array.length];
        mergeSort(array, 0, array.length, tmp);
    }

    private static void mergeSort(int[] array, int left, int right, int[] tmp) {
        if (left + 1 < right) {
            int mid = left + ((right - left) >> 1);
            mergeSort(array, left, mid, tmp);
            mergeSort(array, mid, right, tmp);
            mergeDateSort(array, left, mid, right, tmp);
            System.arraycopy(tmp, left, array, left, right - left);
        }
    }

    private static void mergeDateSort(int[] array, int left, int mid, int right, int[] tmp) {
        int index = left;
        int begin1 = left, begin2 = mid;
        while (begin1 < mid && begin2 < right) {
            if (array[begin1] < array[begin2]) {
                tmp[index++] = array[begin1++];
            } else {
                tmp[index++] = array[begin2++];
            }
        }
        while (begin1 < mid) {
            tmp[index++] = array[begin1++];
        }
        while (begin2 < right) {
            tmp[index++] = array[begin2++];
        }
    }

    //归并循环
    private static void mergeSortNor(int[] array) {
        int[] tmp = new int[array.length];
        int gop = 1;

        while (gop < array.length) {
            for (int left = 0; left < array.length; left += gop * 2) {
                int mid = left + gop;
                int right = mid + gop;
                if (mid > array.length) {
                    mid = array.length;
                }
                if (right > array.length) {
                    right = array.length;
                }
                mergeDateSort(array, left, mid, right, tmp);
            }
            System.arraycopy(tmp, 0, array, 0, array.length);
            gop <<= 1;
        }
    }

    //快排
    private static void quickSort(int[] array) {
        if (null == array || array.length == 0) return;
        quickSort(array, 0, array.length);
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = fun2(array, left, right);
            quickSort(array, left, mid);
            quickSort(array, mid + 1, right);
        }
    }

    private static int fun1(int[] array, int left, int right) {
        int flag = array[left];
        int end = right - 1;
        int begin = left;
        while (begin < end) {
            while (begin < end && array[end] > flag) {
                end--;
            }
            if (begin < end) {
                array[begin] = array[end];
            }
            while (begin < end && array[begin] < flag) {
                begin++;
            }
            if (begin < end) {
                array[end] = array[begin];
            }
        }
        array[begin] = flag;
        return array[begin];
    }

    private static int fun2(int[] arr, int left, int right) {
            int pre = left-1;//pre一直在临界点的左边 就是最后一个小于arr[left]的值的位置
            int cur = left;
            while (cur < right) {
                if (arr[cur] < arr[left] && ++pre != cur) {
                    swap(arr, pre, cur);
                }
                cur++;
            }
              swap(arr, pre, left);
        return arr[left];
    }

    public static void main(String[] args) {
        int[] array = new int[]{9, 2, 1, 5, 4, 6, 3, 7, 0, 8};
        System.out.println(Arrays.toString(array));
        //bubbleSort(array);
        //selectSort(array);
        //insertSort(array);
        //heapSort(array);
        //mergeSort(array);
        //mergeSortNor(array);
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}