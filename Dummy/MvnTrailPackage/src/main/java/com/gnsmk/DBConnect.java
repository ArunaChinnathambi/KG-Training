package com.gnsmk;

import java.sql.*;

public class DBConnect {

    static boolean runQuery(String name, String age, String phone) {

        Connection con = null;
        boolean isSuccess = false;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String sql = "INSERT INTO `studentdetials`(`name`, `age`, `phone`) VALUES ('" + name + "'," + age + "," + phone
                + ")";

        if (con != null) {
            try {
                isSuccess = (con.prepareStatement(sql).executeUpdate() > 0);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return isSuccess;
    }
}