import java.util.*;  
import java.sql.*;  
  
public class EmD {  
  
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
                         "insert into form(name,email,location) values(?,?,?)");  
            //ps.setInt(1,e.getId()); 
            //ps.setString(1,e.getId());             
            ps.setString(1,e.getName());  
            ps.setString(2,e.getEmail());  
            ps.setString(3,e.getLocation());  
              
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
                         "update form set id=?,name=?,email=?,location=?");  
            ps.setString(1,e.getId());
            ps.setString(2,e.getName());    
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getLocation());  
            //ps.setInt(4,e.getId());  
            
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
      //public static int delete(int id){  
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
                e.setEmail(rs.getString(3));  
                e.setLocation(rs.getString(4));  
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
                //e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));    
                e.setEmail(rs.getString(3));  
                e.setLocation(rs.getString(4));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}  