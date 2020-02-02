/**
 * Created with IntelliJ IDEA.
 * Description:
 */
public class Main {
    //给定一个按照升序排列的整数数组 nums，和一个目标值 target。
    // 找出给定目标值在数组中的开始位置和结束位置。
    public int[] searchRange(int[] nums, int target) {
        int i = 0;
        int j = -1;
        int k = -1;
        for (; i < nums.length; i++) {
            if (nums[i] == target) {
                j = i;
                break;
            }
        }
        for (; i < nums.length; i++) {
            if (i + 1 == nums.length || nums[i] < nums[i + 1]) {
                k = i;
                break;
            }
        }
        return new int[]{j, k};
    }

    //atoi 函数，使其能将字符串转换成整数
    public static int myAtoi(String str) {
        int ret = 0;
        char[] arr = str.toCharArray();
        int i = 0;
        int fh = 1;
        int tmp = 0;
        if (arr.length == 0) {
            return 0;
        }
        for (; i < arr.length; i++) {
            if (arr[i] == ' ') {
                continue;
            }
            if (arr[i] == '-') {
                fh = -1;
                i++;
                break;
            } else {
                if (arr[i] == '+') {
                    i++;
                    break;
                }
                if (arr[i] - '0' < 0 || arr[i] - '0' > 9) {
                    return 0;
                } else {
                    break;
                }
            }
        }
        for (; i < arr.length; i++) {
            if (arr[i] - '0' >= 0 && arr[i] - '0' <= 9) {
                tmp = (arr[i] - '0') * fh;
                if (ret > Integer.MAX_VALUE / 10 || (ret == Integer.MAX_VALUE / 10 && tmp > 7)) {
                    return Integer.MAX_VALUE;
                }
                if (ret < Integer.MIN_VALUE / 10 || (ret == Integer.MIN_VALUE / 10 && tmp < -8)) {
                    return Integer.MIN_VALUE;
                }
                ret = ret * 10 + tmp;
            } else {
                break;
            }
        }
        return ret;
    }

    //给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写
    public boolean isPalindrome(String s) {
        if (s.equals("")) {
            return true;
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (Character.isLetter(tmp) || Character.isDigit(tmp)) {
                sb1.append(tmp);
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            char tmp = s.charAt(i);
            if (Character.isLetter(tmp) || Character.isDigit(tmp)) {
                sb2.append(tmp);
            }
        }
        return sb1.toString().equalsIgnoreCase(sb2.toString());
    }
}

