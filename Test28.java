//����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�

//��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�



class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int count = 0;
        for(int i = 0; i< len;i++) {
            if(nums[i] == val) {
                count++;
            }else {
                nums[i-count] = nums[i];
            }
        }
        return len-count;
    }
}