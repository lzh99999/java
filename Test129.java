输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。

import java.util.*;
public class Solution {
        private ArrayList<String> ret = new ArrayList<>();
        private TreeSet<String> ts = new TreeSet<>();
        private StringBuffer stringBuffer = new StringBuffer();
        private boolean[] flags = null;
    public ArrayList<String> Permutation(String str) {
       if(str == null || str.equals("")) return ret;
            char[] chars = str.toCharArray();
            flags = new boolean[chars.length];
            fun(chars,0);
            ret.addAll(ts);
            return ret;
    }
        private void fun(char[] chars,int len) {
                if(len == chars.length) {
                        ts.add(stringBuffer.toString());
                        return;
                }
                
                for(int i = 0;i < chars.length;i++) {
                        if(!flags[i]) {
                                flags[i] = true;
                                stringBuffer.append(chars[i]);
                                fun(chars,len+1);
                                flags[i] = false;
                                stringBuffer.deleteCharAt(stringBuffer.length()-1);
                        }
                }
        }
}