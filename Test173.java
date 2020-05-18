import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int caozuo = sc.nextInt();
                int shu = sc.nextInt();
                if (caozuo == 1) {
                    list.add(shu);
                }else {
                    int index = list.indexOf(shu);
                    list.remove(index);
                }
                if (list.size() < 3) {
                    System.out.println("No");
                }else {
                    list.sort(((o1, o2) -> o2-o1));
                    int max = list.get(0);
                    int sum = 0;
                    for (int j = 1; j < list.size(); j++) {
                        sum+=list.get(j);
                    }
                    if (sum > max) {
                        System.out.println("Yes");
                    }else {
                        System.out.println("No");
                    }
                }
            }
        }
    }
}