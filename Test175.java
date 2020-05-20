import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<Integer, Integer> map = new HashMap<>();
    private static boolean[] booleans;
    private static int[] array;
    private static int index = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        booleans = new boolean[n];
        array = new int[n];
        for (int i = 0; i < k; i++) {
            int key = sc.nextInt();
            int v = sc.nextInt();
            map.put(key, v);
        }
       fun();
    }

    private static void fun() {
        if (index == array.length) {
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    System.out.println(array[i]);
                } else {
                    System.out.print(array[i] + "");
                }
            }
            return;
        }
        for (int i = 1; i <= booleans.length; i++) {
         if (!booleans[i-1]) {
             int tmp = 0;
             if (index != 0){
                 tmp = array[index - 1];
             }
             Integer v = map.get(tmp);
             if (v != null && v == i){
                 continue;
             }
             array[index] = i;
             booleans[i-1] = true;
             index++;
             fun();
             booleans[i-1] = false;
             index--;
         }
      }
    }
}