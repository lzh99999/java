//�ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int tmp = 0;
        int ret = x;
        while(ret !=0) {
            int a = ret % 10;
            tmp = tmp*10 + a;
            ret /= 10;
        }
        return tmp == x;
    }
}