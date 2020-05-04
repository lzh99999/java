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
