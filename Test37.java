//����һ�����ǵݼ�˳��������������� A������ÿ�����ֵ�ƽ����ɵ������飬Ҫ��Ҳ���ǵݼ�˳������
class Solution {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        for(int i =0;i<len;i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}