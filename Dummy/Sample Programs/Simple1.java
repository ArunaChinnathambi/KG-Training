import java.lang.Cloneable;
 
class Simple {


public  void msg(){System.out.println("Hello java");}//C.T.Error  
 
}  
  
class Simple1 implements Cloneable
    {
        public Object clone()throws CloneNotSupportedException{
return super.clone();
} 
        public static void main(String arg[])
        {
            try{
            Simple1 ob=new Simple1();
            Simple1 ob1=(Simple1) ob.clone();
            ob1.msg();
       }catch(CloneNotSupportedException c){}
        }  
    }   