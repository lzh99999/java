class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int sum = 1;
        for(int i =0,j= i+1;j<s.length();j++){
            String a = s.substring(i,i+1);
            String b = s.substring(j,j+1);
            if(a.equals(b)) {
                sum++;
            }else {
                sum--;
            }
            if(sum == 0) {
               i= j+1;
                count++;
            }
        }
        return count;
    }
}