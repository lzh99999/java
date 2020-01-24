package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述:HashMap<String,String[]>  参数为数组
 */
public class Test3 {
    public static void main(String[] args) {
        String text = "11=aa&22=bb&33=cc&22=ee&33=nn&22=oo&55=pp";
        HashMap<String,String[]> hashMap = new HashMap<>();
        String[] split = text.split("[=&]");
        System.out.println(Arrays.toString(split));

        for (int i = 0; i <split.length ; i+=2) {
            String name = split[i];
            if (!hashMap.containsKey(name)) {
                hashMap.put(name,new String[]{split[i+1]});
            }else {
                String[] strings = hashMap.get(name);
                strings = Arrays.copyOf(strings,strings.length+1);
                strings[strings.length-1] = split[i+1];
                hashMap.put(name,strings);
            }
        }
        for (Map.Entry<String, String[]> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() +":" + Arrays.toString(entry.getValue()));
        }
    }
}
