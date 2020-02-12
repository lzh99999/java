import java.util.Arrays;
import java.util.Scanner;

/**
 * ÃèÊö:½«Ğ¡Ğ´×Ö·û´®ÅÅĞò
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
