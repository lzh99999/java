//����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�

//����Լ������������ظ�Ԫ�ء�
class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        for(int i = 0;i <len;i++) {
            if(nums[i] > target) {
                return 0;
            }
            if(nums[i]==target) {
                return i;
            }
            if(nums[i] < target  && i+1 <len&& nums[i+1] > target) {
                return i+1;
            }
           
        }
        return len;
    }
}