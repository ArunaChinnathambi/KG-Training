

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/RegisterViewServlet")
public class RegisterViewServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<a href='index.jsp'>Add Student</a>");
		out.println("<h1>Student List</h1>");
		
		List<Pojo> list=StudentDao.getAllStudent();
		
		out.print("<table border='1' width='100%'");
		out.print("<tr><th>Name</th><th>Password</th><th>Email</th><th>PhoneNo</th><th>Place</th><th>Edit</th><th>Delete</th></tr>");
		for(Pojo pojo:list){
			out.print("</td><td>"+pojo.getName()+"</td><td>"+pojo.getPassword()+"</td><td>"+pojo.getEmail()+"</td><td>"+pojo.getPhoneno()+"</td><td>"+pojo.getPlace()+"</td><td><a href='EditServlet?name="+pojo.getName()+"'>edit</a></td><td><a href='DeleteServlet?name="+pojo.getName()+"'>delete</a></td></tr>");
		}
		out.print("</table>");
		
		out.close();
	}
}
