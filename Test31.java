//����һ������� (ransom) �ַ�����һ����־(magazine)�ַ������жϵ�һ���ַ���ransom�ܲ����ɵڶ����ַ���magazines������ַ����ɡ�������Թ��ɣ����� true �����򷵻� false��

//(��Ŀ˵����Ϊ�˲���¶������ּ���Ҫ����־������������Ҫ����ĸ����ɵ����������˼��

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         StringBuilder sb = new StringBuilder(magazine);
        int count = -1;
        for (int i = 0; i < ransomNote.length(); i++) {
            count = sb.indexOf(ransomNote.charAt(i)+"");
            if (count>=0) {
                sb.deleteCharAt(count);
            }else {
                return false;
            }
        }
        return true;
    }
}

