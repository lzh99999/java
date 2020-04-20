import java.util.*;
public class Main {
    public HashSet<Integer> set = new HashSet<>();
    public ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            boolean[] flag = new boolean[n+1];
            fun(n,flag);

            System.out.println();
        }
    }
    private static void fun(int n,boolean[] flag) {

    }
}