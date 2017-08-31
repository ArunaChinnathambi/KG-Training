import java.sql.*;
import java.io.*;

public class Maindb {
    public static void main(String[] args) {
        DB db = new DB();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fileup", "root", "");
            if (conn != null) {
                System.out.println("this is working");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}