import java.util.Arrays;
import java.util.List;

public class Sum {
  public static void main(String...args){

    List<Integer> numbers = Arrays.asList(3,4,5,1,2);
    
    int sum = numbers.stream().reduce(0, (a, b) -> a + b);
    System.out.println(sum);
  }
}
