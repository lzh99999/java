class Solution {
    public static void main(String[] args) {
        System.out.println(addStrings("22123","123"));
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while(i >= 0 || j >= 0){
            int a1 = i>=0 ? num1.charAt(i)-'0':0;
            int a2 = j>=0 ? num2.charAt(j)-'0':0;
            int tmp = a1+a2+carry;
            carry = tmp/10;
            res.append(tmp%10);
            i--;
            j--;
        }
        if (carry==1){
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
