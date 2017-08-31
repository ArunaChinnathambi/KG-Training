import java.util.*;  
class Csp{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();
 /*list.add("Ravi");
  list.add("Vijay"); 
  list.add(1,"Ravi"); 
  list.add("Ajay");  */
 
    Scanner in=new Scanner(System.in);
    System.out.println("enter string");
   
   for(int i=0;i<5;i++)
    {
         String a=in.next();
         
        list.add(i,a);
        
    }
    System.out.println(list);
   
  Iterator itr=list.iterator(); 
  System.out.println("show string collection"); 
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  