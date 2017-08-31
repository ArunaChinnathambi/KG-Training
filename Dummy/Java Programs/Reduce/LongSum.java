import java.util.stream.Stream;

public class LongSum {
  public static void main(String...args){
    long l = Stream.iterate(1L, i -> i + 1).limit(3).reduce(Long::sum).get();
    System.out.println(l);
  }
}