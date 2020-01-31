import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 */
public class Main {
    //给定一个非负整数数组 A，返回一个数组，在该数组中，
    // A 的所有偶数元素之后跟着所有奇数元素。
    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length-1;

        while(left < right) {
            while (A[left] %2 ==0 && left <right) {
                left++;
            }
            while (A[right] %2 != 0 && left<right) {
                right--;
            }
            int tmp = A[right];
            A[right] = A[left];
            A[left] = tmp;
            left++;
            right--;
        }
        return A;
    }
    //给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
    //我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和
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
//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0 ; i--) {
            digits[i]++;
            digits[i] = digits[i] %10;
            if (digits[i] != 0 ) {
                return digits;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }

    //第三大的数
    public int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int x:nums) {
            set.add(x);
        }
        nums = new int[set.size()];
        int i = 0;
        for (int x:set) {
            nums[i++] = x;
        }
        Arrays.sort(nums);
        if (nums.length < 2) {
            return nums[nums.length-1];
        }else {
            return nums[nums.length-3];
        }
    }

  //给定一个整数数组 nums 和一个目标值 target，
    // 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
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
  //两个字符串二进制相加
  public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int jin = 0;
      for (int i = a.length()-1,j = b.length()-1;i>=0||j >=0; i--,j--) {
              int sum  = jin;
              sum += i>=0 ? a.charAt(i)-'0':0;
              sum += j>=0 ? b.charAt(j)-'0':0;
              sb.append(sum%2);
              jin = sum/2;
      }
      if (jin ==1) {
          sb.append(1);
      }
      return sb.reverse().toString();
  }

}


