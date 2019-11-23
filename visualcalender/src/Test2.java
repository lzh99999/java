import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入日期（格式为yyyy-mm-dd）:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Date date = df.parse(str);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.set(Calendar.DATE,1);
        for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= calendar.getActualMaximum(Calendar.DATE); i++) {
            System.out.print(i+"\t");
            int x = calendar.get(Calendar.DAY_OF_WEEK);
            if (x == Calendar.AUGUST){
                System.out.println();
            }
            calendar.add(Calendar.DATE,1);
        }
    }
}
