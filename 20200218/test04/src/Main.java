
/**
 * 描述:给定当前的时间，请用英文的读法将它读出来。
 * 　　时间用时h和分m表示，在英文的读法中，读一个时间的方法是：
 * 　　如果m为0，则将时读出来，然后加上“o'clock”，如3:00读作“three o'clock”。
 * 　　如果m不为0，则将时读出来，然后将分读出来，如5:30读作“five thirty”。
 * 　　时和分的读法使用的是英文数字的读法，其中0~20读作：
 * 　　0:zero, 1: one, 2:two, 3:three, 4:four, 5:five, 6:six, 7:seven, 8:eight, 9:nine, 10:ten, 11:eleven, 12:twelve, 13:thirteen, 14:fourteen, 15:fifteen, 16:sixteen, 17:seventeen, 18:eighteen, 19:nineteen, 20:twenty。
 * 　　30读作thirty，40读作forty，50读作fifty。
 * 　　对于大于20小于60的数字，首先读整十的数，然后再加上个位数。如31首先读30再加1的读法，读作“thirty one”。
 * 　　按上面的规则21:54读作“twenty one fifty four”，9:07读作“nine seven”，0:15读作“zero fifteen”。
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        String hs = "";
        String ms = "";

        String[] ret = new String[]{"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        String[] strings = new String[60];
        for (int i = 0; i < ret.length; i++) {
            strings[i] = ret[i];
        }
        strings[30] = "thirty";
        strings[40] = "forty";
        strings[50] = "fifty";
        if (m == 0) {
            if (h <= 20) {
                hs = strings[h]+" "+"o'clock";
            } else {
                hs = strings[(m / 10)*10] + " " + strings[h % 10]+" "+"o'clock";
            }
            System.out.println(hs);
            return;
        }
            if (h <= 20) {
                hs = strings[h];
            } else {
                hs = strings[(h / 10)*10] + " " + strings[h % 10];
            }
        if (m <= 20 || m % 10 == 0) {
            ms = strings[m];
        } else {
            ms = strings[(m / 10)*10] +" "+ strings[m % 10];
        }
        System.out.println(hs+" "+ms);
    }
}
