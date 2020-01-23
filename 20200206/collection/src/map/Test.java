package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 描述:map的基本操作
 * map中的键不能重复。
 */
public class Test {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("aa",11);
        map.put("bb",12);
        map.put("cc",13);
        map.put("dd",14);
        map.put("ee",15);
        System.out.println(map);

        System.out.println(map.get("aa"));

        System.out.println(map.containsKey("ee"));
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }
        int hashCode = map.hashCode();
        System.out.println("hashCode = " + hashCode);
    }
}
