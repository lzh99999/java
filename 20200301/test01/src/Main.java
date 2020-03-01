import java.util.Scanner;

/**
 * 描述:　输入一个字符串，将大写字符变成小写、小写变成大写，然后输出
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
               ret.append( Character.toLowerCase(str.charAt(i)));
            }
            if (Character.isLowerCase(str.charAt(i))) {
                ret.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println(ret.toString());
    }
}
