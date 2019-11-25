class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length ==0) {
            return "";
        }
        
        StringBuilder ret = new StringBuilder("");
        for(int i=0;i<strs[0].length();i++) {
            for(int j=1;j<strs.length;j++) {
                if(strs[j].length()<=i||strs[0].charAt(i) != strs[j].charAt(i)) {
                    return ret.toString();
                }
            }
            ret.append(strs[0].charAt(i));
        }
         return ret.toString();
    }
}