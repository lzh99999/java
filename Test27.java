class Solution {
    public static String toLowerCase(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int tmp = ch[i]-'A';
            if (tmp>=0 && tmp < 26) {
                ch[i] = (char) (ch[i]+32);
            }
        }
        return new String(ch);
        }
}