public int[] sortArrayByParity(int[] A) {
        int[] ret = new int[A.length];
        int min = 0, max = A.length-1;
        for (int i : A) {
            if (i % 2 == 0) {
                ret[min++] = i;
            }else {
                ret[max--] = i;
            }
        }
        return ret;
    }

