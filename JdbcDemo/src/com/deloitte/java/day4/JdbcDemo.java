package com.deloitte.java.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/sample";
        String user = "root";
        String password = "Guntawale@16";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to the database successfully!");
        stmt = conn.createStatement();
        String sql = "SELECT * FROM sample.employees";
        rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println(rs.getInt("id") + " " + rs.getString("name") +" " + rs.getDouble("salary") + " " + rs.getString("position") + " " + rs.getDate("hire_date"));
        }

        rs.close();
        stmt.close();
        conn.close();
    }

}
