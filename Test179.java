import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    private static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            fun(1, m, n);
            for (ArrayList<Integer> integers : ret) {
                int i = 0;
                for (; i < integers.size() - 1; i++) {
                    System.out.print(integers.get(i)+" ");
                }
                System.out.println(integers.get(i));
            }
        }
    }

    private static void fun(int i, int m, int n) {
        if (m==0) {
            ret.add(new ArrayList<>(list));
        }else {
            for (int j = i; j <=m && i <= n; j++) {
                list.add(i);
                fun(i+1,m-i,n);
                list.remove(list.size()-1);
            }
        }
    }
}