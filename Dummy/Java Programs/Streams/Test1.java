import java.util.function.BiFunction;
/*  w  w  w. jav a 2 s.c o m*/
public class Test {
  public static void main(String[] args) {
    BiFunction<Integer,BiFunction<Integer,String,String>,String > bi = (x, y) -> {      
      return x + y;
    };
  BiFunction<Integer,String,String> b = (p,q)-> {return p+q;};
    System.out.println(bi.apply(5,(b.apply(6,"Five"))));
  }
  public String get(Integer i,String s){
      
  }
}