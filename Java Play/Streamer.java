import java.util.stream.*;
//import java.lang.Math;
public class Streamer{

    public static void main(String... z){
       //int lo=Math.max(1,5);
       int lo = Stream.of(0,9,8,7,6,5,4,3,2,1,10).max(Math::min).get();
        System.out.println(lo);
    }
}