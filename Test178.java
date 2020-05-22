import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            String[] strs = str.split(";");

            int left = 0;
            int right = 0;
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < 2) {
                    continue;
                }
                char ch = strs[i].charAt(0);
                try {
                    Integer shu = Integer.parseInt(strs[i].substring(1));
                    if ('A' == ch) {//左
                        left -= shu;
                    } else if ('D' == ch) {//右
                        left += shu;
                    } else if ('W' == ch) {//上
                        right += shu;
                    } else if ('S' == ch) {//下
                        right -= shu;
                    }
                } catch (NumberFormatException e) {
                    continue;
                }
            }
            System.out.println(left + "," + right);
        }
    }
}