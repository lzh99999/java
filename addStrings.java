class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int count = 0;
        while(i>= 0 || j>= 0) {
            int a = i >= 0? num1.charAt(i)-'0':0;
            int b = j >=0?num2.charAt(j)-'0':0;
            int tmp = a+b+count;
            count = tmp/10;
            str.append(tmp%10);
            i--;
            j--;
        }
        if(count == 1) {
            str.append(1);
        }
        return str.reverse().toString();
    }
}