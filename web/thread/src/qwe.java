//输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
// 打印能拼接出的所有数字中最小的一个。
// 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
class Solution {

    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }
        int[] ret = new int[index];
        ret[0] = 1;
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;
        for (int i = 1; i < index; i++) {
            ret[i] = Math.min(ret[p2] * 2, Math.min(ret[p3] * 3, ret[p5] * 5));
            if (ret[i] == ret[p2] * 2) p2++;
            if (ret[i] == ret[p3] * 3) p3++;
            if (ret[i] == ret[p5] * 5) p5++;
        }
        return ret[index - 1];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 323, 32123};
        String s = PrintMinNumber(arr);
        System.out.println(s);
    }

    public static String PrintMinNumber(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int tmp = numbers[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (isBig(numbers[j], tmp)) {
                    swap(numbers, j + 1, j);
                } else {
                    break;
                }
            }
            numbers[j + 1] = tmp;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
        }
        return sb.toString();
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static boolean isBig(int i, int j) {
        while (i != 0 || j != 0) {
            if (i == 0) return true;
            if (i % 10 > j % 10) {
                return true;
            } else if (i % 10 < j % 10) {
                return false;
            } else {
                i /= 10;
                j /= 10;
            }
        }
        return false;
    }
}
