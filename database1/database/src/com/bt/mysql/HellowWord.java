package com.bt.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * Description:
 */
public class HellowWord {
    public static void main(String[] args) {
        Connection connection = null;//连接
        Statement statement = null;//语句

        //加载数据库驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/",
                    "root", "");//创建连接
            statement = connection.createStatement();//创建语句对象
            statement.execute("create database aseq");//执行语句
            //statement.execute("drop database aseq");
            statement.execute("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
