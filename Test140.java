import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String n = sc.next();
            StringBuffer sb = new StringBuffer();
            for(int i = 0;i < n.length();i++) {
                char ch = n.charAt(i);
                int tmp = ch+3;
                char a = (char) tmp;
                sb.append(a);
            }
            System.out.println(sb.toString());
        }
    }
}