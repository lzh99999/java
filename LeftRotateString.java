public class Solution {
    public String LeftRotateString(String str,int n) {
        int len = str.length();
        if(len <=1|| n==0) {
            return str;
        }
        return  str.substring(n) + str.substring(0, n);
    }
}