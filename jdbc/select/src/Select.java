import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 描述:使用jdbc操作数据库 处理结果集
 */
public class Select {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/coursse_system";
        String user = "root";
        String passWord = "";
        String sql = "sleect * from coursse_system";
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.建立连接
        Connection conn = DriverManager.getConnection(url, user, passWord);
        //3.创建发射器
        Statement stat = conn.createStatement();
        //4.执行sql语句
        ResultSet rs = stat.executeQuery(sql);
        //5.处理结果集
        while (rs.next()) {

        }
        //6.关闭资源
    }
    public static void asd(String a,String b) {}
}
