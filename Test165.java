import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringBuilder str = new StringBuilder();
            String STR = new String();
            STR = scan.next();
            str.append(STR);
            list.add(str);
        }
       StringBuilder str = new StringBuilder();
        for (int i = 0; i < N; i++) {
            str = list.get(i);
            int j = 0;
            List<Character> slist = new LinkedList<>();
            while (j < str.length()) {
                char a = str.charAt(j);
                if (slist.isEmpty()) {
                    slist.add(0, a);
                    j++;
                } else if (slist.size() == 1 && slist.get(0) == a) {
                    slist.add(1, a);
                    j++;
                } else if (slist.size() == 2 && slist.get(1) == a) {
                    str.deleteCharAt(j);
                } else if (slist.size() == 2 && slist.get(1) != a) {
                    slist.add(a);
                    j++;
                } else if (slist.size() == 3 && slist.get(2) == a) {
                    str.deleteCharAt(j);
                } else if (slist.size() == 3 && slist.get(2) != a) {
                    slist.clear();
                    slist.add(a);
                    j++;
                } else {
                    slist.clear();
                    slist.add(a);
                    j++;
                }
            }
            System.out.println(str);
        }
    }
}