package com.bt.mysql;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 */
public class Test {
    private final static String URL = "jdbc:mysql://localhost/aseq";
    private final static String USER = "root";
    private final static String PASSWORD = "";
    public static DataSource getDataSource() {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setURL(URL);
        ((MysqlDataSource) dataSource).setUser(USER);
        ((MysqlDataSource) dataSource).setPassword(PASSWORD);
        return dataSource;
    }
    public static void ceateTable() {
        DataSource dataSource = getDataSource();
        Connection connection = null;
        Statement statement = null;

        connection = dataSource.getConnection();

    }
    public static void main(String[] args) {

    }
}
