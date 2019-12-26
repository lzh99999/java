//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
class Solution {
    public void rotate(int[] nums, int k) {
        while(k>0) {
            int tmp = nums[nums.length-1];
            for(int i =nums.length-2;i>=0;i--) {
                nums[i+1] = nums[i];
            }
           nums[0] = tmp;
            k--;
        }
    }
}