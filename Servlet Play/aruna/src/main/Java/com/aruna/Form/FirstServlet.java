import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/FirstServlet")

public class FirstServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.getWriter().println("<html><body><h1>Hello World I am Back!</h1></body></html>");
	}
}