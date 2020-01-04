//����һ���ַ��� S������ ����ת��ġ� �ַ��������в�����ĸ���ַ���������ԭ�أ���������ĸ��λ�÷�����ת��
class Solution {
    public String reverseOnlyLetters(String S) {
        if(S.length() == 0 || S == null) {
            return S;
        }
        StringBuilder sb = new StringBuilder(S);
        int left = 0;
        int right = sb.length()-1;
        char rich = sb.charAt(right);
        char lfch = sb.charAt(left);
        while (left<right) {
            while (!((lfch >='A' && lfch <= 'Z') || (lfch >='a' && lfch <= 'z'))) {
                left++;
                if(left>right){
                    break;
                }
                lfch = sb.charAt(left);
            }
            while (!((rich >='A' && rich <= 'Z') || (rich >='a' && rich <= 'z'))) {
                right--;
                 if(left>right){
                    break;
                }
                rich = sb.charAt(right);
            }
             if(left>right){
                    break;
                }
            sb.setCharAt(right,lfch);
            sb.setCharAt(left,rich);
            left++;
            right--;
            lfch = sb.charAt(left);
            rich = sb.charAt(right);

        }
        return sb.toString();
    }
}