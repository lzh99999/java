import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalender {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        c.set(2011,2,10,12,23,34);
        Date d = c.getTime();
        System.out.println(d);
        c.add(Calendar.YEAR,90);
        System.out.println(c);
    }
}
