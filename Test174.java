import java.util.Arrays;
import java.util.Stack;

public class Main {
    //堆排序
    private static void heapSort(int[] array) {
        int size = array.length - 1;
        for (int root = (array.length - 1 - 1) / 2; root >= 0; root--) {
            down(array, root, array.length);
        }
        while (size > 0) {
            swap(array, 0, size);
            down(array, 0, size);
            size--;
        }
    }

    private static void down(int[] array, int root, int size) {
        int child = 2 * root + 1;
        while (child < size) {
            if (child + 1 < size && array[child + 1] > array[child]) {
                child++;
            }
            if (array[root] > array[child]) {
                break;
            } else {
                swap(array, root, child);
                root = child;
                child = 2 * root + 1;
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    //快排
    private static void quick(int[] array) {
        Stack<Integer> stack = new Stack<>();
        stack.push(array.length);
        stack.push(0);
        while (!stack.empty()) {
            int left = stack.pop();
            int right = stack.pop();
            if (left < right) {
                int key = fun(array, left, right);
                //[left,key) [key+1,right)
                stack.push(right);
                stack.push(key + 1);
                stack.push(key);
                stack.push(left);
            }
        }
    }

    private static int fun(int[] array, int left, int right) {
        int pre = left;
        int cur = left + 1;
        while (cur < right) {
            if (array[cur] < array[left] && ++pre != cur) {
                swap(array, pre, cur);
            }
            cur++;
        }
        if (++pre != array.length) {
            swap(array, pre, left);
        }
        return array[left];
    }

    private static void merge(int[] array) {
        int gop = 1;
        int[] tmp = new int[array.length];
        while (gop < array.length) {
            for (int left = 0; left < array.length; left += gop * 2) {
                int mid = left + gop;
                int right = mid + gop;
                if (mid > array.length) mid = array.length;
                if (right > array.length) right = array.length;
                mergeDate(array, left, mid, right, tmp);
            }
            System.arraycopy(tmp, 0, array, 0, array.length);
            gop <<= 1;
        }
    }

    private static void mergeDate(int[] array, int left, int mid, int right, int[] tmp) {
        int index = left;
        int begin = left,begin1 = mid;
        while (begin < mid && begin1 < right) {
            if (array[begin] < array[begin1]) {
                 tmp[index++] = array[begin++];
            }else {
                tmp[index++] = array[begin1++];
            }
        }
        while (begin < mid) {
            tmp[index++] = array[begin++];
        }
        while (begin1 < right) {
            tmp[index++] = array[begin1++];
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 0, 2, 1, 5, 4, 3, 7, 8, 6};
//        heapSort(array);
//        quick(array);
        merge(array);
        System.out.println(Arrays.toString(array));
    }
}
/*    private static void merge(int[] array) {
        if (array != null) {
            int[] tmp = new int[array.length];
            merge(array, 0, array.length, tmp);
        }
    }

    private static void merge(int[] array, int i, int length, int[] tmp) {
        if (i + 1 < length) {
            int mid = i + ((length - i) >> 1);
            merge(array, i, mid, tmp);
            merge(array, mid, length, tmp);
            mergeDate(array, i, mid, length, tmp);
            System.arraycopy(tmp, i, array, i, length - i);
        }
    }

    private static void mergeDate(int[] array, int i, int mid, int length, int[] tmp) {
        int index = i;
        int left = i, right = mid;
        while (left < mid && right < length) {
            if (array[left] < array[right]) {
                tmp[index++] = array[left++];
            } else {
                tmp[index++] = array[right++];
            }
        }
        while (left < mid) {
            tmp[index++] = array[left++];
        }
        while (right < length) {
            tmp[index++] = array[right++];
        }
    }

    private static void mergeNor(int[] array) {
        int[] tmp = new int[array.length];
        int gop = 1;
        while (gop < array.length) {
            for (int left = 0; left < array.length; left += gop * 2) {
                int mid = left + gop;
                int right = mid + gop;
                if (mid > array.length) mid = array.length;
                if (right > array.length) right = array.length;
                mergeDate(array, left, mid, right, tmp);
            }
            System.arraycopy(tmp, 0, array, 0, array.length);
            gop <<= 1;
        }
    }

    private static void quickSort(int[] array) {
        Stack<Integer> stack = new Stack<>();
        stack.push(array.length);
        stack.push(0);
        while (!stack.empty()) {
            int left = stack.pop();
            int right = stack.pop();
            if (left < right) {
                int key = fun1(array, left, right);
                //[left,key)
                //[key+1,right)
                stack.push(right);
                stack.push(key + 1);
                stack.push(key);
                stack.push(left);
            }
        }
    }

    private static int fun1(int[] arr, int left, int right) {
        int begin = left;
        int end = right - 1;
        int jizhun = arr[left];
        while (begin < end) {
            while (begin < end && jizhun < arr[end]) {
                end--;
            }
            if (begin < end)
                arr[begin] = arr[end];
            while (begin < end && jizhun > arr[begin]) {
                begin++;
            }
            if (begin < end)
                arr[end] = arr[begin];
            end--;
        }
        arr[begin] = jizhun;
        return arr[begin];
    }

    private static int fun(int[] array, int left, int right) {
        int pre = left;
        int cur = left + 1;
        while (cur < right) {
            if (array[cur] < array[left] && ++pre != cur) {
                swap(array, pre, cur);
            }
            cur++;
        }
        if (++pre != array.length) {
            swap(array, pre, left);
        }
        return array[left];
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static void heapSort(int[] array) {
        int size = array.length-1;
        for (int root = (array.length-1-1)/2; root >=0 ; root--) {
            shutdown(array,root,array.length);
        }
        while (size >0) {
            swap(array,0,size);
            shutdown(array,0,size);
            size--;
        }
    }

    private static void shutdown(int[] array, int root, int size) {
        int child = root * 2 + 1;
        while (child < size) {
            if (child + 1 < size && array[child] < array[child + 1]) {
                child++;
            }
            if (array[root] < array[child]) {
                swap(array, root, child);
                root = child;
                child = 2 * root + 1;
            }else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 6, 8, 1, 3, 5, 4, 9, 0};
        //mergeNor(array);
//        quickSort(array);
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}