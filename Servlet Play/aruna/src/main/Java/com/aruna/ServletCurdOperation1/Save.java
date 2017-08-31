import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/Save")  
public class Save extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  

       /* String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid); */
       // String id=request.getParameter("id"); 
        String name=request.getParameter("name");   
        String email=request.getParameter("email");  
        String location=request.getParameter("location");  
          
        Emp e=new Emp();
      //  e.setId(id);  
        e.setName(name);   
        e.setEmail(email);  
        e.setLocation(location);  
          
        int status=EmD.save(e);  
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("index.html").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
    }  
  
}  