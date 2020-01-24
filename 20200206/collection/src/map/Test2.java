package map;

import java.util.HashMap;

/**
 * 描述:统计字符串字符出现的次数
 */
public class Test2 {
    public static void main(String[] args) {
        String text = "aaaaaaaaaasssssssss";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i <text.length() ; i++) {
            char cc = text.charAt(i);
            if (hashMap.containsKey(cc)) {
                int a = hashMap.get(cc);
                hashMap.put(cc,a+1);//如果不是第一次插入就把key所对应的value值
                                     // 取出来加1之后在放进去
            }else {
                hashMap.put(cc,1);
            }
        }
        System.out.println(hashMap);
    }
}
