import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 */
public class Main {
    public static String toLowerCase(String string) {
        char[] ch = string.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int tmp = ch[i]-'A';
            if (tmp>=0 && tmp < 26) {
                ch[i] = (char) (ch[i]+32);
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.setSn(8);
        student.setName("hh");
        student.setCourseId(2);
       // DatabaseOperator.insertStudent(student);
        DatabaseOperator.selectStudnet();
    }
}
