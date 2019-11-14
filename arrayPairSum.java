public class Solution {
    public int arrayPairSum(int[] nums) {
     Arrays.sort(nums);
     int num = 0;
     for(int i =0;i < nums.length;i+=2) {
         num += nums[i];
     }
     return num;
    }
}

