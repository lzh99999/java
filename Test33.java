/*����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��� s�����������һ�����ʵĳ��ȡ�

����ַ����������ҹ�����ʾ����ô���һ�����ʾ��������ֵĵ��ʡ�

������������һ�����ʣ��뷵�� 0 ��

˵����һ��������ָ������ĸ��ɡ��������κοո�� ������ַ���*/
class Solution {
    public int lengthOfLastWord(String s) {
        String trim = s.trim();
        int last = trim.lastIndexOf(" ");
       if (last == -1) return trim.length();
        return trim.length()-last-1;
    }
}
