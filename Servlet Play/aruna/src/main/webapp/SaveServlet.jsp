<html>
    
    <head>
        <title>
            CURD Operation
        </title>
    </head>

    <body>
        <h1>Add New Employee</h1>  
        <form action="SaveServlet" method="post">  
            
            <table>
                <tr><td>Id:</td><td><input type="text" name="id"/></td></tr>    
                <tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
                <tr><td>Password:</td><td><input type="password" name="password"/></td></tr>    
                <tr><td>Email:</td><td><input type="email" name="email"/></td></tr>  
                <tr><td>Location:</td><td><input type="text" name="location"/></td></tr>   
                <tr><td colspan="2"><input type="submit" value="Save Employee"/></td></tr>  
            </table>  
       
        </form>  <br/>  
        
        <a href="ViewServlet">view employees</a>  
    </body>
</html>
  