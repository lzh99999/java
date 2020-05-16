import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            TreeMap<Character,Integer> map = new TreeMap<>();
            String str = sc.nextLine();
            int x = 26;
            for (int i = 0; i < x; i++) {
                map.put((char) ('A'+i),0);
            }
            for (int i = 0; i < str.length(); i++) {
                char tmp = str.charAt(i);
                if(map.containsKey(tmp)) {
                    map.put(tmp, map.get(tmp) + 1);
                }
            }
            for (Map.Entry<Character, Integer> tmp : map.entrySet()) {
                System.out.println(tmp.getKey()+":"+tmp.getValue());
            }
        }
    }
}