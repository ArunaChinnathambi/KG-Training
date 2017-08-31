import java.util.*;  
import java.sql.*;  
import java.lang.String;
  
public class StudentDao {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
           Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration", "root", "");
 
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Pojo pojo){  
        int status=0;  
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into register(Name,password,Email,phoneno,place) values (?,?,?,?,?)");  
            ps.setString(1,pojo.getName());  
            ps.setString(2,pojo.getPassword());  
            ps.setString(3,pojo.getEmail());
            ps.setString(4,pojo.getPhoneno());  
            ps.setString(5,pojo.getPlace());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Pojo e){  
        int status=0;  
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update register set password=?,email=?,phoneno=?,place=? where name=?");  
            
            ps.setString(1,e.getPassword());  
            ps.setString(2,e.getEmail());  
             ps.setString(3,e.getPhoneno());  
            ps.setString(4,e.getPlace());  
            ps.setString(5,e.getName());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(String name){  
        int status=0;  
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from register where name=?");  
            ps.setString(1,name);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static int login(String name,String password){  
        int status=0,userresult=0; 
        String dbname="",dbpass=""; 
        try{  
            Connection con=StudentDao.getConnection();
            PreparedStatement ps=con.prepareStatement("select name,password from register where name=?"); 
            ps.setString(1,name);
            ResultSet rs=ps.executeQuery();  
            int i=0;
            if (rs.next()) {
              dbname=rs.getString(1);  
                dbpass=rs.getString(2);  
            }   
        }
        catch(Exception e)
        {e.printStackTrace();}
       
        if((password.equals(dbpass))&&(name.equals(dbname)))
        {
                System.out.println("Success");
                userresult=1;
                return userresult;
            }
            else
            {
                return userresult;
            }
    }
    
    public static Pojo getStudentName(String name){  
        Pojo pojo=new Pojo();  
          
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from register where name=?");  
            ps.setString(1,name);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){    
                pojo.setName(rs.getString(1));  
                pojo.setPassword(rs.getString(2));  
                pojo.setEmail(rs.getString(3)); 
                pojo.setPhoneno(rs.getString(4));  
                pojo.setPlace(rs.getString(5));  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return pojo;  
    }  
    public static List<Pojo> getAllStudent(){  
        List<Pojo> list=new ArrayList<Pojo>();  
          
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from register");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Pojo pojo=new Pojo();  
                pojo.setName(rs.getString(1));    
                pojo.setPassword(rs.getString(2));  
                pojo.setEmail(rs.getString(3));
                pojo.setPhoneno(rs.getString(4));  
                pojo.setPlace(rs.getString(5));  
                list.add(pojo);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}  