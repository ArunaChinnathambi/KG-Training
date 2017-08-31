import java.util.*;
class Hash{
 public static void main(String args[]){
 
  HashMap<Integer,String> hm=new HashMap<Integer,String>();

  hm.put(100,"Amit");
  hm.put(102,"Rahul");
  hm.put(101,"Vijay");
  

  for(Map.Entry m:hm.entrySet()){
   System.out.println(m.getKey()+" "+m.getValue());
  }
 }
}
