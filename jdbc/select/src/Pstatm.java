import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * 描述:防止sql注入   用PreparedStatement  替换Statement
 */
public class Pstatm {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String classid = sc.nextLine();
        String classname = sc.nextLine();
        String url = "jdbc:mysql://localhost:3306/coursse_system?useUnicode=true&characterEncoding=utf8&useSSL=false";
        String user = "root";
        String passWord = "";
        String sql = "select count(*) from class where classid=? and classname=?";
        //count(*)
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        Connection conn = DriverManager.getConnection(url, user, passWord);
        //获得发送器
        PreparedStatement pstat = conn.prepareStatement(sql);
        pstat.setString(1, classid);
        pstat.setString(2, classname);
        System.out.println(sql);
        //执行sql
        ResultSet rs = pstat.executeQuery();
        //处理结果集
        //因为使用的是count(*)返回一个查询到的个数 登录系统
        if (rs.next()) {
            int count = rs.getInt(1);
            if (count < 1) {
                System.out.println("输入的信息有错误！");
            } else {
                System.out.println("输入信息正确！");
            }
        }
        //关闭资源
        rs.close();
        pstat.close();
        conn.close();
    }
}
