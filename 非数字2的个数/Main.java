
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == 'a' ||str.charAt(i) == 'e'||str.charAt(i) == 'i'
                    ||str.charAt(i) == 'o'||str.charAt(i) == 'u') {
                System.out.println(str.charAt(i));
                break;
            }
        }
        System.out.println('n');
    }
}
