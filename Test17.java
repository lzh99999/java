    //����һ���Ǹ��������� A������һ�����飬�ڸ������У�
    // A ������ż��Ԫ��֮�������������Ԫ�ء�
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