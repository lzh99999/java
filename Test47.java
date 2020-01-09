//����һ���ַ�������֤���Ƿ��ǻ��Ĵ���ֻ������ĸ�������ַ������Ժ�����ĸ�Ĵ�Сд��
class Solution {
    public boolean isPalindrome(String s) {
           if (s.equals("")) {
            return true;
        }
        StringBuilder  sb1 = new StringBuilder();
        StringBuilder  sb2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (Character.isLetter(tmp) || Character.isDigit(tmp)) {
                sb1.append(tmp);
            }
        }
        for (int i = s.length()-1; i >=0; i--) {
            char tmp = s.charAt(i);
            if (Character.isLetter(tmp) || Character.isDigit(tmp)) {
                sb2.append(tmp);
            }
        }
        return sb1.toString().equalsIgnoreCase(sb2.toString());
    }
}