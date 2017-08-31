import java.util.function.BiFunction;
/*  w  w  w. jav a 2 s.c o m*/
public class Test {
   
  public static void main(String[] args) {

 Test t=new Test();

    BiFunction<Integer,String,String > bi = (x, y) -> x + y;
  
   GetMethod gm = (p,q) -> p+q ;
    System.out.println(bi.apply(5,(t.gm(6,"Five"))));
}
interface GetMethod {
      String getMethod(int p, String q);
}
}