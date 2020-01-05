//����һ���������͵����� nums�����дһ���ܹ��������顰�����������ķ�����

//���������������������������ģ����������������������Ԫ����ӵĺ͵����Ҳ�����Ԫ����ӵĺ͡�

//������鲻����������������ô����Ӧ�÷��� -1����������ж��������������ô����Ӧ�÷��������ߵ���һ����
class Solution {
    public int pivotIndex(int[] nums) {
          if (nums == null || nums.length == 0) {
            return -1;
        }
        int sum = 0;
        int lfs = 0;
        for (int x:nums) {
            sum += x;
        }
        for (int i = 0; i < nums.length ; i++) {
            if(lfs == sum - lfs - nums[i]) {
                return i;
            }
            lfs += nums[i];
        }
        return -1;
    }
}