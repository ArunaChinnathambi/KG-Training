import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Login")
public class Login extends HttpServlet {  

public void doGet(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
            try{
    response.setContentType("text/html");
        PrintWriter out = response.getWriter();  
        String name = request.getParameter("username");
        String pass = request.getParameter("password");
        
        int result=StudentDao.login(name,pass);
        out.println(result);
        if(result==1)
        {
            HttpSession session = request.getSession();
            session.setAttribute("hello",name);
            response.sendRedirect("Wel");
           
            out.close();
        }

    else
    {  
        response.setContentType("text/html");
        out.println("Sorry UserName  Password Error!");  
       
        }  
    } 
   catch(Exception e){System.out.println(e);}  
  
}  
}