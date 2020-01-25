package map;

import java.util.*;

/**
 * 描述:HashMap 的参数为<String,List<String>>
 */
public class Test4 {
    public static void main(String[] args) {
        String text = "11=aa&22=bb&33=cc&22=ee&33=nn&22=oo&55=pp";
        HashMap<String, List<String>> hashMap = new HashMap<>();
        String[] split = text.split("[=&]");
        System.out.println(Arrays.toString(split));

        for (int i = 0; i < split.length; i += 2) {
            String name = split[i];
            if (!hashMap.containsKey(name)) {
                List<String> list = new ArrayList<>();
                list.add(split[i + 1]);
                hashMap.put(name, list);
            } else {
                List<String> list = hashMap.get(name);
                list.add(split[i+1]);
            }
        }
        for (Map.Entry<String, List<String>> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() +":" + entry.getValue());
        }
    }
}
