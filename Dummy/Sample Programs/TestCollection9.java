import java.util.*;
class TestCollection9{
 public static void main(String args[]){
 
  HashSet<String> al=new HashSet<String>();
Scanner in=new Scanner(System.in);

int i;
for(i=0;i<3;i++)
 {
     int j=0;
    String st=in.next();
    al.add(j,st);
  j++;
 }
  Iterator<String> itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
 }
}
