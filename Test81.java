//�����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ���������������һ���������ַ�����S���������ѭ������Kλ���������������磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
public class Solution {
    public String LeftRotateString(String str,int n) {
        int len = str.length();
        if(len <=1|| n==0) {
            return str;
        }
        return  str.substring(n) + str.substring(0, n);
    }
}