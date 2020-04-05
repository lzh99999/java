import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * 描述:
 */
public class Main {
    //直接插入排序
    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            while (j >= 0 && tmp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = tmp;
        }
    }

    //二分插入排序
    private static void binInsertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int right = i;
            int left = 0;
            while (left < right) {
                int mid = (left + right) / 2;
                if (arr[mid] == tmp) {
                    left = mid;
                    break;
                } else if (arr[mid] < tmp) {
                    left = mid + 1;
                } else if (arr[mid] > tmp) {
                    right = mid;
                }
            }
            for (int j = i - 1; j >= left; j--) {
                arr[j + 1] = arr[j];
            }
            arr[left] = tmp;
        }
    }

    //希尔排序
    private static void shellSort(int[] arr) {
        int bu = 3;
        while (bu >= 1) {
            for (int i = 1; i < arr.length; i++) {
                int tmp = arr[i];
                int j = i - bu;
                while (j >= 0 && tmp < arr[j]) {
                    arr[j + bu] = arr[j];
                    j -= bu;
                }
                arr[j + bu] = tmp;
            }
            bu--;
        }
    }

    //简单选择排序
    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            swap(arr, max, arr.length - 1 - i);
        }
    }

    //选择排序的优化  每次找出最大值和最小值
    private static void selectSortOP(int[] arr) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end) {
            int index = begin;
            int max = begin;
            int min = begin;
            while (index <= end) {
                if (arr[index] < arr[min]) {
                    min = index;
                }
                if (arr[index] > arr[max]) {
                    max = index;
                }
                index++;
            }
            swap(arr, min, begin);
            if (begin != max)
                swap(arr, max, end);
            begin++;
            end--;
        }
    }

    //堆排序
    private static void heapSort(int[] arr) {
        int size = arr.length - 1;
        //升序建立大堆   降序建立小堆
        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            shiftDown(arr, i, arr.length);
        }
        while (size > 0) {
            swap(arr, 0, size);
            shiftDown(arr, 0, size);
            size--;
        }
    }

    //向下调整
    private static void shiftDown(int[] arr, int root, int size) {
        int child = 2 * root + 1;
        while (child < size) {
            if (child + 1 < size && arr[child] < arr[child + 1]) {
                child += 1;
            }
            if (arr[root] > arr[child]) {
                break;
            } else {
                swap(arr, root, child);
                root = child;
                child = 2 * root + 1;
            }
        }
    }

    private static void swap(int[] arr, int max, int i) {
        int tmp = arr[max];
        arr[max] = arr[i];
        arr[i] = tmp;
    }

    //快速排序[left,right)
    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int key = portion2(arr, left, right);
            quickSort(arr, left, key);
            quickSort(arr, key + 1, right);
        }
    }

    //第一种
    private static int portion(int[] arr, int left, int right) {
        int begin = left;
        int end = right - 1;
        int flag = arr[end];
        while (begin < end) {
            while (begin < end && arr[begin] <= flag) {
                begin++;
            }
            while (begin < end && arr[end] >= flag) {
                end--;
            }
            if (begin < end) {
                swap(arr, begin, end);
                begin++;
                end--;
            }
        }
        swap(arr, begin, right - 1);
        return begin;
    }

    //第二种  挖坑法
    private static int portion1(int[] arr, int left, int right) {
        int begin = left;
        int end = right - 1;
        int jizhun = arr[left];
        while (begin < end) {
            while (begin < right && jizhun < arr[end]) {
                end--;
            }
            if (begin < end)
                arr[begin] = arr[end];
            while (begin < right && jizhun > arr[begin]) {
                begin++;
            }
            if (begin < end)
                arr[end] = arr[begin];
            end--;
        }
        arr[begin] = jizhun;
        return arr[begin];
    }

    //第三种 前后指针
    private static int portion2(int[] arr, int left, int right) {
        int pre = left;
        int cur = left + 1;
        while (cur < right) {
            if (arr[cur] < arr[left] && ++pre != cur) {
                swap(arr, pre, cur);
            }
            cur++;
        }
        if (++pre != left) {
            swap(arr, pre, left);
        }
        return arr[left];
    }

    //快速排序的非递归  用栈来实现
    private static void quickSort(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length);
        stack.push(0);
        while (!stack.empty()) {
            int left = stack.pop();
            int right = stack.pop();
            if (left < right) {
                int key = portion1(arr, left, right);
                //[left,key)
                //[key+1,right)
                stack.push(right);
                stack.push(key + 1);
                stack.push(key);
                stack.push(left);
            }
        }
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{5, 3, 2, 6, 4, 8, 7, 9, 0, 1};
        String a = "";
//        System.out.println(a + "sad");
//        insertSort(arr);
//        binInsertSort(arr);
//        shellSort(arr);
//        selectSort(arr);
//        selectSortOP(arr);
//        heapSort(arr);
//        quickSort(arr, 0, arr.length);
//        quickSort(arr);
//        System.out.println(Arrays.toString(arr));


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = 40;
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if(arr[i] == 40) {
                sum++;
                continue;
            }
            for (int j = i+1; j < n; j++) {
                int tmp = 40;
                tmp -= arr[i];
                if(tmp == 0) {
                    sum++;
                    continue;
                }
                for (int k = j; k < n; k++) {
                    if (tmp >= arr[k]) {
                        tmp -= arr[k];
                        if (tmp == 0) {
                            sum++;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

