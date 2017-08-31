import java.util.stream.Stream;
import java.util.function.Function;

class ReduceString{
    public static void main(String... z){
        Stream.of("Hello","Welcome","Back")
            .reduce((a,b) -> a+b)
            .ifPresent(System.out::println);
    }
}