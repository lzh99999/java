//����һ�������������е��������� nums����һ��Ŀ��ֵ target���ҳ�����Ŀ��ֵ�������еĿ�ʼλ�úͽ���λ�á�
class Solution {
    public int[] searchRange(int[] nums, int target) {
              int i = 0;
        int j = -1;
        int k = -1;
        for (; i < nums.length ; i++) {
            if (nums[i] == target) {
                j =i;
                break;
            }
        }
        for (; i < nums.length; i++) {
            if (i+1 == nums.length ||nums[i] <nums[i+1]) {
                k=i;
                break;
            }
        }
        return new int[]{j,k};
    }
}