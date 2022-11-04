package io.shulie.chaosbladedemo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlService {

    static final String DB_URL = "jdbc:mysql://192.168.1.146:3306/demo?useUnicode=true&characterEncoding=UTF-8&useSSL=false&autoReconnect=true&failOverReadOnly=false&maxReconnects=15000&allowMultiQueries=true";
    //  Database credentials
    static final String USER = "root";
    static final String PASS = "shulie@2020";

    public static String select() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        try {
            ResultSet rs = stmt.executeQuery("select * from target_xingxing");
            return rs.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return null;
    }
}
