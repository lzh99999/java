import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date(1245446546464L);
        String str =  date.format(d);//date格式化输出 字符串
        System.out.println(str);

        DateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        String strq = "1982-2-5";
        Date dw = date1.parse(strq);
        System.out.println(dw);
    }
}

