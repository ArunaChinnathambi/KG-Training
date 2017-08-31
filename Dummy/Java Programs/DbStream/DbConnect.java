

import java.sql.*;

public class DbConnect {
    static Connection conn = null;

    public static Connection getDbConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/starkindustries", "root", "");
        } catch (Exception e) {
        }
        return conn;
    }
}