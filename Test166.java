import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.charAt(0)-'0';
        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len1 = o1.length();
                int len2 = o2.length();
                if (len1>len2) {
                    return 1;
                } else if (len1 <len2) {
                    return -1;
                } else {
                    for (int i = o1.length() - 1; i >= 0; i--) {
                        char tmp1 = o1.charAt(i);
                        char tmp2 = o2.charAt(i);
                        if (tmp1 > tmp2) {
                            return 1;
                        } else if (tmp2 > tmp1) {
                            return -1;
                        }
                    }
                    return 0;
                }
            }
        });

        for (int i = 0; i < n; i++) {
            String tmp = sc.nextLine();
            set.add(tmp);
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}