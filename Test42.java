//����һ���ǿ����飬���ش������е������������������ڣ��򷵻���������������Ҫ���㷨ʱ�临�Ӷȱ�����O(n)��

class Solution {
    public int thirdMax(int[] c) {
        int max = 0;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int i = 0;i<c.length;i++) {
             if (c[i] == max||c[i] == max2||c[i] == max3) {
                continue;
            }
            if (c[i] > max) {
                max3 = max2;
                max2 = max;
                max = c[i];
            }else if (c[i]>max2) {
                max3 = max2;
                max2 = c[i];
            }else if (c[i] > max3){
                max3 = c[i];
            }
        }
        
       if (max3 == Integer.MIN_VALUE ) return max; 
        return max3;
    }
}