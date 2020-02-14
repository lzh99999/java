import java.sql.*;
import java.util.UUID;

/**
 * 描述:
 */
public class NumberJdbcTest {
    public static void main(String[] args) {
        int number = 100000;
        long start = System.currentTimeMillis();
        insert(number);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void insert(int number) {
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&useSSL=false&characterEncoding=utf8";
        String user = "root";
        String passWord = "";
        Connection conn = null;
        PreparedStatement pstat = null;
        String sql = "insert into number values (?,?,?)";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, passWord);

            pstat = conn.prepareStatement(sql);
            int j = 0;
            conn.setAutoCommit(false);
            for (int i = 2; i <= number ; i++) {
                String id = UUID.randomUUID().toString().replace("-", "");
                pstat.setString(1, id);
                pstat.setInt(2, i);
                pstat.setString(3, isPrime(i));
                pstat.addBatch();//加入批处理操作
            }
            pstat.executeBatch();//执行批处理
            int i = pstat.executeUpdate();
            conn.commit();

        } catch (ClassNotFoundException e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                pstat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    private static String isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return "HS";
            }
        }
        return "ZS";
    }
}
