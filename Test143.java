import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String ret = AddLongInteger(str1, str2);
        System.out.println(ret);
    }

    public static String AddLongInteger(String str1, String str2) {
        StringBuffer sb = new StringBuffer();
        sb.deleteCharAt(1);
        int i = str1.length() - 1;
        int j = str2.length() - 1;
        int tmp = 0;
        while (i >= 0 || j >= 0) {
            int ch1 = i < 0 ? 0 : str1.charAt(i) - '0';
            int ch2 = j < 0 ? 0 : str2.charAt(j) - '0';
            int sum = ch1 + ch2 + tmp;
            sb.append(sum % 10);
            tmp = sum / 10;
            i--;
            j--;
        }
        if(tmp !=0) sb.append(tmp);
        sb.reverse();
        return sb.toString();
    }
}