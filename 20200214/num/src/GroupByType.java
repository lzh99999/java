import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述:使用type分组然后存到hashMap中
 */
public class GroupByType {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Map<String,Integer> map = new HashMap<>();
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&useSSL=false&characterEncoding=utf8";
        String user = "root";
        String passWord = "";
        Connection conn = null;
        PreparedStatement pstat = null;
        String sql = "select type ,count(*) from number group by type ";

        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, passWord);
        pstat = conn.prepareStatement(sql);
        ResultSet rs = pstat.executeQuery();

        while (rs.next()) {
            map.put(rs.getString(1),rs.getInt(2));
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
