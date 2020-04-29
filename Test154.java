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
