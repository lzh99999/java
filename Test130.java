import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] array = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                array[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                String ch = sc.next();
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (ch.equals("Q")) {
                    if (b < a) {
                        int tmp = a;
                        a = b;
                        b = tmp;
                    }
                    int max = array[a];
                    for (int j = a + 1; j <= b; j++) {
                        if (max < array[j]) {
                            max = array[j];
                        }
                    }
                    System.out.println(max);
                } else if (ch.equals("U")) {
                    array[a] = b;
                }
            }
        }
    }
}