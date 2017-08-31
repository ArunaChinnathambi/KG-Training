import java.util.*;  
public class Coll{  
public static void main(String args[]){  
HashSet<String> set=new HashSet<String>(); 
set.add("Amit");  
set.add("Vijay");  
set.add("Kumar");  
set.add("Sachin");  
set.add("vijay");
set.add("sachin");
  Iterator<String> itr=set.iterator(); 
   
  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
 
}  
}  
  