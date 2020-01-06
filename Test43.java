//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer> hp = new HashMap<>();
      for (int i = 0; i < nums.length ; i++) {
          int search = target - nums[i];
          if (hp.containsKey(search)) {
              return new int[]{hp.get(search),i};
          }
          hp.put(nums[i],i);
      }
      return null;
    }
}