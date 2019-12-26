//给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。

//不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。



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