给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
         int max = array[0];
            for(int i = 1; i < array.length;i++) {
                    array[i] +=(array[i-1] > 0 ? array[i-1]:0);
                    max = Math.max(max,array[i]);
            }
            return max;
    }
}