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