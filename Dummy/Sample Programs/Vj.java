 class Tes{  
private String name;
private int a; 
   
 
public int getName()
{
    return new Vj(name,a);
}
public void setName(String name,int a){  
this.name=name;
this.a=a;
}  
}  
  
public class Vj{  
public static void main(String[] args){  
Tes s=new Tes();  
s.setName("vijay",45);  
System.out.println(s.getName());  
//System.out.println(s.pass());
}  
}  