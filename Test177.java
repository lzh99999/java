import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();
            System.out.println(jiami(str1));
            System.out.println(jiemi(str2));
        }
    }

    private static String jiami(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'z') {
                sb.append('A');
            } else {
                char tmp = (char) (ch + 1);
                tmp = Character.toUpperCase(tmp);
                sb.append(tmp);
            }
        }
        return sb.toString();
    }

    private static String jiemi(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A') {
                sb.append('z');
            } else {
                char tmp = (char) (ch - 1);
                tmp = Character.toLowerCase(tmp);
                sb.append(tmp);
            }
        }
        return sb.toString();
    }
}