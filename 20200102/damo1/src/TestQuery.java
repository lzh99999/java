import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * Description:
 */
public class TestQuery {
    public static DataSource getDataSource() {
        MysqlDataSource da = new MysqlDataSource();
        da.setURL("jdbc:mysql://localhost:3306");
        da.setUser("root");
        da.setPassword("");
        return da;
    }
    public static void main(String[] args) throws Exception{
        Connection connection = getDataSource().getConnection();
    }
}
