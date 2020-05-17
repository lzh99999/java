import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //十六进制的字符串
            String str = sc.next();
            str = str.substring(2);
            int i = Integer.parseInt(str,16);
            System.out.println(i);
        }
    }
}