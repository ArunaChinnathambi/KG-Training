# ***Java 8 Fretures***
# ***Functional Interface***
# ***Stream*** 
# ***Reduce***

***Description***

    Stream reduce() operation can be used when we want to derive a single value from a collection of values.

    Examples:
        
        sum(), min(), max(), count() etc are 
    
    reduce() applies a binary operator to each element in the stream where the first argument to the operator is the return value of the previous application and the second argument is the current stream element.

***Syntax***

    Stream.reduce() with Accumulator:

        reduce(BinaryOperator accumulator)

    Stream.reduce() with Identity and Accumulator:

        reduce(T identity, BinaryOperator<T> accumulator)  
   
   Stream.reduce() with Identity, Accumulator and Combiner:

        reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)

***Programs***

`````
/*Reduce Sum*/

import java.util.Arrays;
import java.util.List;

public class Sum {
  public static void main(String...args){

    List<Integer> numbers = Arrays.asList(3,4,5,1,2);
    
    int sum = numbers.stream().reduce(0, (a, b) -> a + b);
    System.out.println(sum);
  }
}
`````
`````
/*Reduce Longest String*/

import java.util.stream.Stream;
import java.util.function.Function;

class LongestString{
    public static void main(String... z){

      Stream.of("shm","iued","uydevf","shd","sghd")
            .reduce((a,b) -> a.length() >= b.length() ? a:b)
            .findFirst()
            .ifPresent(System.out::println);
    }
}
`````
`````
/*Reduce ReduceString*/

import java.util.stream.Stream;
import java.util.function.Function;

class ReduceString{
    public static void main(String... z){

        Stream.of("Hello","Welcome","Back")
            .reduce((a,b) -> a+b)
            .ifPresent(System.out::println);
    }
}
`````
