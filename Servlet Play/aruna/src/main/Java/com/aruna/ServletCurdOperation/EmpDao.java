import java.util.*;  
import java.sql.*;  
  
public class EmpDao {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into form(id,name,password,email,location) values(?,?,?,?,?)");  
            //ps.setInt(1,e.getId()); 
            ps.setString(1,e.getId());             
            ps.setString(2,e.getName());            
            ps.setString(3,e.getPassword()); 
            ps.setString(4,e.getEmail());  
            ps.setString(5,e.getLocation());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update form set name=?,password=?,email=?,location=? where id=?");  
           
            ps.setString(1,e.getName());  
            ps.setString(2,e.getPassword());   
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getLocation()); 
            ps.setString(5,e.getId()); 
            //ps.setInt(4,e.getId());  
            
            status=ps.executeUpdate();  
              
            con.close(); 
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
   // public static int delete(int id){  
    public static int delete(String id){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from form where id=?");  
            ps.setString(1,id); 
            //ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Emp getEmployeeById(String id){
    //public static Emp getEmployeeById(int id){  
        Emp e=new Emp();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from form where id=?");  
            ps.setString(1,id);
            //ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                //e.setId(rs.getInt(1));
                e.setId(rs.getString(1));  
                e.setName(rs.getString(2)); 
                e.setPassword(rs.getString(3));    
                e.setEmail(rs.getString(4));  
                e.setLocation(rs.getString(5));  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    public static List<Emp> getAllEmployees(){  
        List<Emp> list=new ArrayList<Emp>();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from form");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                e.setId(rs.getString(1));
                e.setName(rs.getString(2));
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));     
                e.setLocation(rs.getString(5));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}  