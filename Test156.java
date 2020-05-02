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
