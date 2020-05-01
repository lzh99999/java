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
