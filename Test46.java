//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
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