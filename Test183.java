import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (map.containsKey(tmp)) {
                int val = map.get(tmp);
                map.put(tmp,val+1);
            }else {
                map.put(tmp,1);
            }
        }
        int i = 0;
        for (Integer integer : map.keySet()) {
            if (map.get(integer) % 2 != 0) {
                i++;
                if (i == 2) {
                    System.out.println(integer);
                }else {
                    System.out.print(integer+" ");
                }
            }

        }
    }
}