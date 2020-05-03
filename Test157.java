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
