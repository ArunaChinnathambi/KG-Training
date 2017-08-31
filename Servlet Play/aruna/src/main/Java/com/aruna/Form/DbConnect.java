import java.io.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
@WebServlet("/form")
public class DbConnect extends HttpServlet{
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{

       // res.setContentType("text/html");

PrintWriter op = res.getWriter();

String name = req.getParameter("name");
String email = req.getParameter("email");
String date = req.getParameter("date");
String time = req.getParameter("time");
String topic = req.getParameter("topic");
String location = req.getParameter("location");

op.print(name + " " + email + " " + date + " " + time + " " + topic + " " + location );

try{
    Class.forName("com.mysql.jdbc.Driver");

    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
   // Statement st = con.createStatement();
    
    PreparedStatement ps = con.prepareStatement( "insert into form(name,email,date,time,topic,location) values(?,?,?,?,?,?)");
        ps.setString(1,name);
        ps.setString(2,email);
        ps.setString(3,date);
        ps.setString(4,time);
        ps.setString(5,topic);
        ps.setString(6,location);
        int i=ps.executeUpdate();
        if(i>0)
        op.print("Registration Success");

}catch (Exception e){

  e.printStackTrace();

}
    op.close();
    }
}