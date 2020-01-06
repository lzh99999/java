//����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
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