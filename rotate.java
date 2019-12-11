class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length-1;
       while(k>0) {
           int tmp = nums[len];
           for(int i = len-1;i>=0;i--) {
               nums[i+1] = nums[i];
           }
           nums[0] = tmp;
           k--;
       }
    }
}