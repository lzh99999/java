    //给定一个非负整数数组 A，返回一个数组，在该数组中，
    // A 的所有偶数元素之后跟着所有奇数元素。
    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length-1;

        while(left < right) {
            while (A[left] %2 ==0 && left <right) {
                left++;
            }
            while (A[right] %2 != 0 && left<right) {
                right--;
            }
            int tmp = A[right];
            A[right] = A[left];
            A[left] = tmp;
            left++;
            right--;
        }
        return A;
    }