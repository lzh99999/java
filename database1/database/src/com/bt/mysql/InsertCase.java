package com.bt.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * Description:
 */
public class InsertCase {
    public static void createTable() {
        Connection connection = null;
        Statement statement = null;
        try {
            //1,加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2，获取连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost/aseq",
                    "root", "");
            //3，创建对象
            statement = connection.createStatement();
            //4，执行语句
            //String sql = "create table "+"new_table1 ( col int not null)";
            statement.execute("create table new_table1 ( col int not null)");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5，关闭资源
        finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void insertIntoTable() {
        Connection connection = null;
        Statement statement = null;
        try {
            //1,加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2，获取连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost/aseq",
                    "root", "");
            //3，创建对象
            statement = connection.createStatement();
            //4，执行语句
            String sql = "insert into new_table2 values(2)";
            statement.execute(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5，关闭资源
        finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //createTable();
        insertIntoTable();
    }
}
