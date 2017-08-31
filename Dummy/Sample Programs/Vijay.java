public class Tes{  
private String name;  
   
public String getName(){  
return name;  
}  
public void setName(String name){  
this.name=name;
}  
}  
  
public class Vijay{  
public static void main(String[] args){  
Tes s=new Tes();  
s.setName("vijay");  
System.out.println(s.getName());  
}  
}  