import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                String ch = sc.next();
                int a = sc.nextInt();
                int b = sc.nextInt();
 
                if (ch.equals("Q")) {
                    if (b < a) {
                        int tmp = a;
                        a = b;
                        b = tmp;
                    }
                    int max = arr[a];
                    for (int i = a + 1; i <= b; i++) {
                        if (arr[i] > max) max = arr[i];
                    }
                    System.out.println(max);
                } else if (ch.equals("U")) {
                    arr[a] = b;
                }
            }
        }
    }
}