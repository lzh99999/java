
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        System.out.print("请输入日期（格式为（1970-09-12））：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Date date = df.parse(str);
        Calendar c = new GregorianCalendar();
        c.setTime(date);
        c.set(Calendar.DATE,1);
        for (int i = 1; i < c.get(Calendar.DAY_OF_WEEK); i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= c.getActualMaximum(Calendar.DATE) ; i++) {
            System.out.print(i+"\t");
            int count = c.get(Calendar.DAY_OF_WEEK);
            if (count == Calendar.AUGUST) {
                System.out.println();
            }
            c.add(Calendar.DATE,1);
        }
    }
}
