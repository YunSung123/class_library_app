package com.tenco.library.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

///  DB 연결 담당
public class DatabaseUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul";
    private static final String DB_USER = System.getenv("DB_USER");
    private static final String PASSWORD = System.getenv("DB_PASSWORD");

    // 새로운 DB 연결 객체를 반환 합니다.
    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(URL, DB_USER, PASSWORD);
        System.out.println();
//        System.out.println(connection.getMetaData().getDatabaseProductName());
//        System.out.println(connection.getMetaData().getDatabaseProductVersion());

        return  connection;
    }
}
