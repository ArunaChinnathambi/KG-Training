import java.util.stream.Stream;

class Intersection{
    public static void main(String... z){
       
         java.io.Serializable ser = (java.io.Serializable & Calculator) (x,y)-> x + y;
         System.out.println(ser.calculate(2,3));

    }
    }
    interface Calculator{
      // final static long x=2,y=3;
  long calculate(long x, long y);
}