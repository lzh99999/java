import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.sun.org.apache.regexp.internal.RE;

import javax.sql.DataSource;
import javax.swing.plaf.synth.SynthTableUI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 */
public class DatabaseOperator {
    private static final String URL = "jdbc:mysql://localhost:3306/coursse_system";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    //获取数据源
    public static DataSource getDataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL(URL);
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);
        return dataSource;
    }

    //查询学生表
    public static void insertStudent(Student stu) {
        Connection connection = null;
        PreparedStatement pstat = null;
        //建立连接
        try {
            connection = getDataSource().getConnection();
            String sql = "insert into student(name,sn,class) values(?,?,?)";
            pstat = connection.prepareStatement(sql);
            pstat.setString(1,stu.getName());
            pstat.setInt(2,stu.getSn());
            pstat.setInt(3,stu.getCourseId());
            pstat.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (pstat != null) {
                try {
                    pstat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //查询学生表
    public static Student selectStudnet() {
        Connection connection = null;
        PreparedStatement pstat = null;
        Student student = new Student();
        //建立连接
        try {
            connection = getDataSource().getConnection();
            String sql = "select count(*) as student_count from student;";
            pstat = connection.prepareStatement(sql);
            ResultSet rs = pstat.executeQuery();
            while (rs.next()) {
                System.out.println("count = " + rs.getInt("student_count"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (pstat != null) {
                try {
                    pstat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return student;
    }
}
