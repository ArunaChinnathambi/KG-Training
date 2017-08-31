import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/Sample")
public class Sample extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      response.setContentType("text/html");
      response.getWriter().println(request.getParameter("first_name") +"\n"
            + request.getParameter("last_name") +"\n"
            + request.getParameter("email") +"\n"
            + request.getParameter("date") +"\n"
            + request.getParameter("time") +"\n"
            + request.getParameter("topic") +"\n"
            + request.getParameter("location"));
   }

   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      doGet(request, response);
   }
}