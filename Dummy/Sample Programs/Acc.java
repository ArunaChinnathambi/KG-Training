class Acc{  
protected void msg(){System.out.println("Hello java");}  
}  
  
public class Simple extends Acc{  
protected void msg(){System.out.println("Hello java");}//C.T.Error  
 public static void main(String args[]){  
   Simple obj=new Simple();  
   obj.msg();  
   }  
}  
class Simple1
    {
        public static void main(String arg[])
        {
            Simple ob=new Simple();
            ob.msg();
        }
    }